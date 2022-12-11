package com.mszlu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszlu.blog.dao.pojo.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    //查询

    public List<User> findUserGtAge(int age);
}
