package com.mszlu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszlu.blog.dao.pojo.Tag;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 查询最热的标签前n条
     * @param limit
     * @return
     */
//    List<Long> findHotsTagIds(int limit);

//    List<Tag> findTagsByTagIds(List<Long> tagIds);

    /**
     * 根据文章id查询标签
     * @param articleId
     * @return
     */
    List<Tag> findTagsByArticleId(Long articleId);

    List<Long> findHotsTagIds(int limit);

    List<Tag> findTagsByTagIds(List<Long> tagIds);
}
