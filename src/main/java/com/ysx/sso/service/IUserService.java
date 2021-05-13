package com.ysx.sso.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ysx.sso.pojo.User;

public interface IUserService extends IService<User> {
   User findByUsername(String username);
    User findByEmail(String username);
}
