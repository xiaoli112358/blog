package com.mszlu.blog.vo.param;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

/**
 * 添加评论
 */
@Data
public class CommentParam {
    @JsonSerialize(using = ToStringSerializer.class)//将查回来的值进行转化，否则会因为长度问题到了前端损失精度
    private Long articleId;//文章id

    private String content;//文章内容

    private Long parent;//父评论id

    private Long toUserId;//被评论的用户id
}
