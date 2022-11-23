package com.mszlu.blog.controller;

import com.mszlu.blog.service.CommentService;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.param.CommentParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    private CommentService commentService;

    /**
     * 根据文章id查询查询评论列表
     *
     * @param articleId
     * @return
     */
    @GetMapping("article/{id}")
    public Result comments(@PathVariable("id") Long articleId) {
        return commentService.commentsByArticleId(articleId);
    }
    /**
     * 评论
     * @param commentParam
     * @return
     */
    /*@PostMapping("create/change")
    public Result comment(@RequestBody CommentParam commentParam){
        return commentService.comment(commentParam);
    }*/
}
