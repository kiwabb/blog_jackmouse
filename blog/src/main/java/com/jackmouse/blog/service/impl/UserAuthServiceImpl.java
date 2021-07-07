package com.jackmouse.blog.service.impl;

import com.jackmouse.blog.entity.UserAuth;
import com.jackmouse.blog.mapper.UserAuthMapper;
import com.jackmouse.blog.service.UserAuthService;
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
public class UserAuthServiceImpl extends ServiceImpl<UserAuthMapper, UserAuth> implements UserAuthService {

}
