package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.Category;
import com.mszlu.blog.vo.CategoryVo;
import com.mszlu.blog.vo.Result;

public interface CategoryService {
    CategoryVo findCategoryById(Long Id);

    /**
     * 查询所有的标签
     * @return
     */
    Result findAll();

    Result findAllDetail();

    Result categoryFindById(Long id);
}
