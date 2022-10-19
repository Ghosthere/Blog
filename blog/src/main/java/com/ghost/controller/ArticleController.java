package com.ghost.controller;

import com.ghost.domain.ResponseResult;
import com.ghost.service.ArticleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ghost
 */

@RestController
@RequestMapping("/article")
@Tag(name = "article api", description = "文章接口")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

//    @GetMapping("/test")
//    public String test() {
//        articleService.hotArticleList();
//        return "test";
//    }

    @GetMapping("/hotArticleList")
    @Operation(summary = "热门文章列表", description = "热门文章列表")
    @ApiResponse(responseCode = "200", description = "热门文章列表", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseResult.class)))
    public ResponseResult getHotArticleList() {
        return articleService.hotArticleList();
    }
}
