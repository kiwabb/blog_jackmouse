package com.jackmouse.blog;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jackmouse.blog.entity.UserAuth;
import com.jackmouse.blog.mapper.UserAuthMapper;
import com.jackmouse.blog.utils.UserUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootTest
class BlogApplicationTests {
    @Autowired
    UserAuthMapper userAuthMapper;

    @Test
    void contextLoads() {
        UserAuth userAuth = UserAuth.builder()
                .id(1)
                .password(BCrypt.hashpw("123456", BCrypt.gensalt()))
                .build();
        userAuthMapper.updateById(userAuth);
    }

    @Test
    void mybatisPlus(){
        QueryWrapper<UserAuth> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("username").eq("username", "admin");
        UserAuth user = userAuthMapper.selectOne(queryWrapper);
        System.out.println(user);
    }

}
