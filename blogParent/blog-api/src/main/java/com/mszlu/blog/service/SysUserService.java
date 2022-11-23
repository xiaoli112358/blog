package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.SysUser;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.UserVo;
import org.apache.catalina.User;

public interface SysUserService {
    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    Result findUserByToken(String token);

    SysUser findUserByAccount(String account);

    /**
     * 注册的新用户
     * @param sysUser
     */
    void save(SysUser sysUser);

    /**
     * 根据作者id查询作者
     * @param authorId
     * @return
     */
    UserVo findUserVoById(Long authorId);
}
