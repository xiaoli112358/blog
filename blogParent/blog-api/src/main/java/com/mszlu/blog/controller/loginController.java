package com.mszlu.blog.controller;

import com.mszlu.blog.service.LoginService;
import com.mszlu.blog.service.SysUserService;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.param.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class loginController {
    @Autowired
    private LoginService loginService;

    /**
     * 点击登录的时候先调用该方法去后台获取token
     * 紧接着前台会拿上该token调用UserController中的方法currentUser验证用户名密码
     * @param loginParam
     * @return
     */
    @PostMapping
    public Result login(@RequestBody LoginParam loginParam) {
        return loginService.login(loginParam);
    }
    /*@RequestMapping
    public Result login(@RequestParam String account,@RequestParam String password) {
        return loginService.login(account,password);
    }*/
}
