package com.mszlu.blog.dao.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 用户
 */
@Data
public class SysUser {
//    @TableId(type = IdType.ASSIGN_ID)//默认id类型
    @TableId(type = IdType.AUTO)//自增(此处自增不生效，默认还是mp的雪花算法，原因暂未知)
    private Long id;

    private String account;

    private Integer admin;

    private String avatar;

    private Long createDate;

    private Integer deleted;

    private String email;

    private Long lastLogin;

    private String mobilePhoneNumber;

    private String nickname;

    private String password;

    private String salt;

    private String status;

}
