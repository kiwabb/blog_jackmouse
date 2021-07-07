package com.jackmouse.blog.service.impl;

import com.jackmouse.blog.entity.Category;
import com.jackmouse.blog.mapper.CategoryMapper;
import com.jackmouse.blog.service.CategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
