package com.mszlu.blog.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
public class CommentVo {
    @JsonSerialize(using = ToStringSerializer.class)//将查回来的值进行转化，否则会因为长度问题到了前端损失精度
    private Long id;

    private UserVo author;

    private String content;

    private List<CommentVo> childrens;

    private String createDate;

    private Integer level;

    private UserVo toUser;
}
