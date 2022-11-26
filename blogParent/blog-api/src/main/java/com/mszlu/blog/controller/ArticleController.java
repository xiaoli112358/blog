package com.mszlu.blog.controller;

import com.mszlu.blog.service.ArticleService;
import com.mszlu.blog.service.CommentService;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.param.CommentParam;
import com.mszlu.blog.vo.param.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Result articles(@RequestBody PageParams pageParams) {
        //ArticleVo 页面接收的数据
//        int a=10/0;
        Result result = articleService.listArticle(pageParams);
        return  result;
    }

    /**
     * 首页 最热文章
     * @return
     */
    @PostMapping("/hot")
    public Result hotarticles() {
        //ArticleVo 页面接收的数据
        int limit=5;
        return  articleService.hotArticle(limit);
    }
    /**
     * 首页 最新文章
     */
    @PostMapping("/new")
    public Result newArticles() {
        //ArticleVo 页面接收的数据
        int limit=5;
        return  articleService.newArticle(limit);
    }
    /**
     * 首页 文章归档
     */
    @PostMapping("/listArchives")
    public Result listArchives() {
        return  articleService.listArchives();
    }

    /**
     * 文章详情
     * @param articleId
     * @return
     */
    @PostMapping("view/{id}")
//    通过 @PathVariable 可以将URL中占位符参数{xxx}绑定到处理器类的方法形参中@PathVariable(“xxx“)
    public Result findArticleById(@PathVariable("id") Long articleId){
        return articleService.findArticleById(articleId);
    }




}
