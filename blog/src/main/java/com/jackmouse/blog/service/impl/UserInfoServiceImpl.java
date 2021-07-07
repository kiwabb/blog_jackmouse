package com.jackmouse.blog.service.impl;

import com.jackmouse.blog.entity.UserInfo;
import com.jackmouse.blog.mapper.UserInfoMapper;
import com.jackmouse.blog.service.UserInfoService;
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
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
