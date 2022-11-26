package com.mszlu.blog.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

@Data
public class UserVo {
    private String nickname;

    private String avatar;
    @JsonSerialize(using = ToStringSerializer.class)//将查回来的值进行转化，否则会因为长度问题到了前端损失精度
    private Long id;
}
