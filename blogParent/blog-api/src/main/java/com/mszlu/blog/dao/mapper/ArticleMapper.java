package com.mszlu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszlu.blog.dao.dos.Archives;
import com.mszlu.blog.dao.pojo.Article;

import java.util.List;

//由于我们直接继承了mybatisplus的BaseMapper所以基本的增删改查都不用再写了。
public interface ArticleMapper extends BaseMapper<Article> {
    List<Archives> listArchives();
}
