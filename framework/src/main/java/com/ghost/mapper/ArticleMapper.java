package com.ghost.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ghost.domain.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * @author ghost
 */
@Mapper
@Repository
public interface ArticleMapper extends BaseMapper<Article> {
}
