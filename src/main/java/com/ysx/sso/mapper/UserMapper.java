package com.ysx.sso.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ysx.sso.pojo.User;

public interface UserMapper extends BaseMapper<User> {
    User findByUsername(String username);

    User findByEmail(String username);
}
