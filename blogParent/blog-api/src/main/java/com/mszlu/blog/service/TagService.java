package com.mszlu.blog.service;

import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.TagVo;

import java.util.List;

public interface TagService  {
//    List<TagVo>findByArticleid(Long articleId);
    List<TagVo> findTagsByArticleId(Long id);

    Result hots(int limit);
}
