package com.jackmouse.blog.controller;

import com.jackmouse.blog.constant.Result;
import com.jackmouse.blog.constant.StatusConst;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LoginController {
    @ApiOperation("登录")
    @PostMapping("/login")
    public Result login(){
        return new Result(true, StatusConst.OK, "登录成功", "OK");
    }
}