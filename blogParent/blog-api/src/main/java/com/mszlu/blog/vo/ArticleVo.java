package com.mszlu.blog.vo;

import lombok.Data;

import java.util.List;

/**
 * 建立与前端交互的Vo文件
 */
@Data
public class ArticleVo {
    private Long id;

    private String title;

    private String summary;

    private Integer commentCounts;

    private Integer viewCounts;

    private Integer weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

    private ArticleBodyVo body;

    private List<TagVo> tags;

    private CategoryVo category;

}
