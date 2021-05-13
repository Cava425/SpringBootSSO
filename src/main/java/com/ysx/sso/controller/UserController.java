package com.ysx.sso.controller;

import com.ysx.sso.pojo.Result;
import com.ysx.sso.pojo.User;
import com.ysx.sso.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService iUserService;

    @GetMapping
    public Object getUser(Authentication authentication){

        User user = (User) authentication.getPrincipal();
        return Result.success(user);
    }
}
