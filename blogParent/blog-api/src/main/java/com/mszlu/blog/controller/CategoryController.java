package com.mszlu.blog.controller;

import com.mszlu.blog.service.CategoryService;
import com.mszlu.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorys")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查询所有的标签
     * @return
     */
    @GetMapping
    public Result categoryFindAll(){
        return categoryService.findAll();
    }
    /**
     * 查询所有标签明细
     * @return
     */
    @GetMapping("/detail")
    public Result categoryFindAllDetail(){
        return categoryService.findAllDetail();
    }

    /**
     * 按分类id查询
     * @param id
     * @return
     */
    //接口url：/category/detail/{id}
    @GetMapping("/detail/{id}")
    public Result categoryFindById(@PathVariable("id") Long id){
        return categoryService.categoryFindById(id);
    }
}
