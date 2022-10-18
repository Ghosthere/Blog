package com.ghost.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghost.domain.ResponseResult;
import com.ghost.domain.entity.Article;
import com.ghost.mapper.ArticleMapper;
import com.ghost.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ghost
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {


    @Override
    public ResponseResult hotArticleList() {
        LambdaQueryWrapper<Article> wrapper = new LambdaQueryWrapper();
        wrapper.eq(Article::getStatus, 0);
        wrapper.orderByDesc(Article::getViewCount);

        Page<Article> page = new Page(1, 10);
        page(page, wrapper);

        List<Article> articles = page.getRecords();

        return ResponseResult.okResult(articles);
    }
}
