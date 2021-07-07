package com.jackmouse.blog.service.impl;

import com.jackmouse.blog.entity.Comment;
import com.jackmouse.blog.mapper.CommentMapper;
import com.jackmouse.blog.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
