package com.jackmouse.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.jackmouse.blog.entity.UserAuth;
import com.jackmouse.blog.entity.UserInfo;
import com.jackmouse.blog.exception.ServeException;
import com.jackmouse.blog.mapper.RoleMapper;
import com.jackmouse.blog.mapper.UserAuthMapper;
import com.jackmouse.blog.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

import static com.jackmouse.blog.utils.UserUtil.convertLoginUser;


/**
 * @author 11921
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserAuthMapper userAuthDao;
    @Autowired
    private UserInfoMapper userInfoDao;
    @Autowired
    private RoleMapper roleDao;
//    @Autowired
//    private RedisService redisService;
    @Resource
    private HttpServletRequest request;

    @Override
    public UserDetails loadUserByUsername(String username) {
        QueryWrapper<UserAuth> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id", "user_info_id", "username", "password", "login_type").eq("username", username);
        if (StringUtils.isBlank(username)) {
            throw new ServeException("用户名不能为空！");
        }
        System.out.println("开始1111111111111111111111111111111111111111");
        // 查询账号是否存在
        /*UserAuth user = userAuthDao.selectOne(new LambdaQueryWrapper<UserAuth>()
                .select(UserAuth::getId, UserAuth::getUserInfoId, UserAuth::getUsername, UserAuth::getPassword, UserAuth::getLoginType)
                .eq(UserAuth::getUsername, username));*/
        UserAuth user = userAuthDao.selectOne(queryWrapper);
        System.out.println(user);
        if (Objects.isNull(user)) {
            throw new ServeException("用户名不存在!");
        }
        System.out.println("结束22222222222222222222222222222222222222222222");
        // 查询账号信息
        UserInfo userInfo = userInfoDao.selectOne(new LambdaQueryWrapper<UserInfo>()
                .select(UserInfo::getId, UserInfo::getEmail, UserInfo::getNickname, UserInfo::getAvatar, UserInfo::getIntro, UserInfo::getWebSite, UserInfo::getIsDisable)
                .eq(UserInfo::getId, user.getUserInfoId()));
        // 查询账号角色
        List<String> roleList = roleDao.listRolesByUserInfoId(userInfo.getId());
        // 查询账号点赞信息
//        Set<Integer> articleLikeSet = (Set<Integer>) redisService.hGet(ARTICLE_USER_LIKE, userInfo.getId().toString());
//        Set<Integer> commentLikeSet = (Set<Integer>) redisService.hGet(COMMENT_USER_LIKE, userInfo.getId().toString());
        // 封装登录信息
        return convertLoginUser(user, userInfo, roleList, new HashSet<Integer>(), new HashSet<Integer>(), request);
    }

}
