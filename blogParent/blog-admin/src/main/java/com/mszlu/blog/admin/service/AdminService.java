package com.mszlu.blog.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mszlu.blog.admin.pojo.Admin;
import com.mszlu.blog.admin.pojo.Permission;
import com.mszlu.blog.admin.pojo.mapper.AdminMapper;
import com.mszlu.blog.admin.pojo.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    public Admin findAdminByUserName(String username){
        LambdaQueryWrapper<Admin> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Admin::getUsername,username).last("limit 1");
        Admin adminUser = adminMapper.selectOne(queryWrapper);
        return adminUser;
    }

    public List<Permission> findPermissionsByAdminId(Long adminId){
        return permissionMapper.findPermissionsByAdminId(adminId);
    }

}

