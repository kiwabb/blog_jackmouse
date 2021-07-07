package com.jackmouse.blog.service.impl;

import com.jackmouse.blog.entity.BlogInfo;
import com.jackmouse.blog.mapper.BlogInfoMapper;
import com.jackmouse.blog.service.BlogInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jackmouse
 * @since 2021-07-05
 */
@Service
public class BlogInfoServiceImpl extends ServiceImpl<BlogInfoMapper, BlogInfo> implements BlogInfoService {

}
