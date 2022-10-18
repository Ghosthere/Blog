package com.ghost.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ghost.domain.ResponseResult;
import com.ghost.domain.entity.Article;

/**
 * @author ghost
 */
public interface ArticleService extends IService<Article> {


    ResponseResult hotArticleList();
}
