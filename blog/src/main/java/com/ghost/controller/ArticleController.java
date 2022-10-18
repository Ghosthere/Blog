package com.ghost.controller;

import com.ghost.domain.ResponseResult;
import com.ghost.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ghost
 */

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

//    @GetMapping("/test")
//    public String test() {
//        articleService.hotArticleList();
//        return "test";
//    }

    @GetMapping("/hotArticleList")
    public ResponseResult getHotArticleList() {
        return articleService.hotArticleList();
    }
}
