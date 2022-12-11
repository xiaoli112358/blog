package com.mszlu.blog.controller;

import com.mszlu.blog.dao.pojo.User;
import com.mszlu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController2 {
    @Autowired
    private UserService userService;

    @GetMapping("findAll")
//    @ApiOperation(value = "获取用户列表")
//    @PreAuthorize("hasAuthority('USER_FINDALL')")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("findAge")
//    @PreAuthorize("hasAuthority('USER_FINDAGE')")
    public List<User> findAge() {
        return userService.findAge();
    }

    @GetMapping("findById")
//    @ApiOperation(value = "查询用户信息",notes = "根据id查询用户信息")
//    @ApiImplicitParam(paramType = "get传参", dataType = "Long", name = "id", value = "用户编号", required = true, example = "1")
//    @PreAuthorize("hasRole('ADMIN')")
    public User findById(@RequestParam("id") Long id) {
        return userService.findById(id);
    }

    @GetMapping("findPage")
    public List<User> findPage(@RequestParam("page") Integer page,
                               @RequestParam("pageSize") Integer pageSize) {
        return userService.findPage(page, pageSize);
    }

    @GetMapping("save")
    public Long findAll(@RequestParam("name") String name) {
        return userService.save(name);
    }

//    @GetMapping("send")
//    public String send(){
//        userService.send();
//        return "success";
//    }
    //问注册中心 要服务提供方的地址
    //发起rpc调用
    //返回的数据 进行解析
//    @DubboReference(version = "1.0.0")
//    private DubboUserService dubboUserService;
//
//    @GetMapping("dubbo")
//    public String dubbo(){
//        dubboUserService.save();
//        return "success";
//    }

}
