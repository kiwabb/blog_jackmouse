package com.jackmouse.blog.service.impl;

import com.jackmouse.blog.entity.Article;
import com.jackmouse.blog.mapper.ArticleMapper;
import com.jackmouse.blog.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jackmouse
 * @since 2021-07-06
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
