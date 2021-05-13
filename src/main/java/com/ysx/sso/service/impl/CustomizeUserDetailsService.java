package com.ysx.sso.service.impl;

import com.ysx.sso.pojo.User;
import com.ysx.sso.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class CustomizeUserDetailsService implements UserDetailsService {

    @Autowired
    IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = null;

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$");
        if(pattern.matcher(username).matches())
            user = userService.findByEmail(username);
        else
            user = userService.findByUsername(username);

        if(user != null) return user;

        throw new UsernameNotFoundException("用户不存在");
    }
}
