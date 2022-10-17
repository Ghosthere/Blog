package com.ghost.framework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghost.framework.domain.Article;
import com.ghost.framework.mapper.ArticleMapper;
import com.ghost.framework.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * @author ghost
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
}
