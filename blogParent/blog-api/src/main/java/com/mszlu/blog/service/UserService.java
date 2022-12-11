package com.mszlu.blog.service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mszlu.blog.dao.mapper.UserMapper;
import com.mszlu.blog.dao.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;


    public List<User> findAll(){
        //增加缓存
        //先去缓存查找，如果缓存有 直接返回 如果缓存没有 从数据库查询 放入缓存
        String userListJsonStr = redisTemplate.opsForValue().get("UserService.findAll");
        if (StringUtils.isNotBlank(userListJsonStr)){
            List<User> users = JSON.parseArray(userListJsonStr, User.class);
            log.info("走了缓存~~~~");
            return users;
        }else {
            List<User> users = userMapper.selectList(new LambdaQueryWrapper<>());
//            redisTemplate.opsForValue().set("UserService.findAll",JSON.toJSONString(users),2,TimeUnit.HOURS);
            log.info("放入缓存~~~~");
            return users;
        }
    }

    public User findById(Long id){
        //查询所有
        return userMapper.selectById(id);
    }

    public List<User> findAge(){
        //查询所有
//        return userMapper.findUserGtAge(20);

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper();
        //where age > 20
        queryWrapper.gt(User::getAge,20);
        return userMapper.selectList(queryWrapper);
    }

    public List<User> findPage(int current,int pageSize){
        //分页查询
        Page<User> page = new Page<>(current,pageSize);

        Page<User> userPage = userMapper.selectPage(page, new LambdaQueryWrapper<>());

        log.info("total:{}",userPage.getTotal());
        log.info("pages:{}",userPage.getPages());
        return userPage.getRecords();
    }

    public Long save(String name) {
       User user = new User();
       user.setAge(20);
       user.setEmail("sss@163.com");
       user.setName(name);
       userMapper.insert(user);
       return user.getId();
    }

    //生产者代码
//    @Autowired
//    private RocketMQTemplate rocketMQTemplate;
//
//    public void send(){
//        //发送一条消息
//        //转换为json发送
//        User user = this.userMapper.selectById(1L);
//        rocketMQTemplate.convertAndSend("topic_springboot",user);
//    }
}
