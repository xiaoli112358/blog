package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.Category;
import com.mszlu.blog.vo.CategoryVo;

public interface CategoryService {
    CategoryVo findCategoryById(Long Id);
}
