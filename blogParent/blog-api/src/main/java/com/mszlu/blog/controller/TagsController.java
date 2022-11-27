package com.mszlu.blog.controller;

import com.mszlu.blog.service.TagService;
import com.mszlu.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//@RestController代表我们返回的是json数据,@RequestMapping("tags")表示路径映射
@RequestMapping("tags")
public class TagsController {
    @Autowired
    private TagService tagService;

    @GetMapping("hot")
    public Result hot() {
        int limit = 6;
        return tagService.hots(limit);
//        return null;
    }

    /**
     * 查询所有的文章标签
     * @return
     */
    @GetMapping
    public Result findAll() {
        return tagService.findAll();
    }
    /**
     * 查询所有的文章标签详细
     * @return
     */
    @GetMapping("/detail")
    public Result findAllDetail() {
        return tagService.findAllDetail();
    }
}
