package com.jackmouse.blog.service.impl;

import com.jackmouse.blog.entity.Tag;
import com.jackmouse.blog.mapper.TagMapper;
import com.jackmouse.blog.service.TagService;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
