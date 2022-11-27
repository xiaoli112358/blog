package com.mszlu.blog.service;

import com.mszlu.blog.dao.pojo.Article;
import com.mszlu.blog.vo.ArticleVo;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.param.ArticleParam;
import com.mszlu.blog.vo.param.PageParams;

import java.util.List;

public interface ArticleService {
    /**
     * 分页查询文章列表
     * @param pageParams
     * @return
     */

    Result listArticle(PageParams pageParams);

    List<ArticleVo> listArticlesPage(PageParams pageParams);
    /**
     * 最热文章
     * @param limit
     * @return
     */
    Result hotArticle(int limit);
    /**
     * 首页 最新文章
     */
    Result newArticle(int limit);

    Result listArchives();

    /**
     * 根据id查看文章详细
     * @param articleId
     * @return
     */
    Result findArticleById(Long articleId);
    /**
     * 文章发布服务
     * @return
     */
    Result publish(ArticleParam articleParam);



}
