package com.jackmouse.blog.service.impl;

import com.jackmouse.blog.entity.Resource;
import com.jackmouse.blog.mapper.ResourceMapper;
import com.jackmouse.blog.service.ResourceService;
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
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

}
