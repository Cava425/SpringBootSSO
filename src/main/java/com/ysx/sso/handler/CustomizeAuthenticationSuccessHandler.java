package com.ysx.sso.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ysx.sso.pojo.Result;
import com.ysx.sso.pojo.User;
import com.ysx.sso.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomizeAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Autowired
    IUserService uerService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        // 更新用户上次登录时间、更新时间等字段
        User user = (User) authentication.getPrincipal();
        Result result = Result.success(200, "登录成功", user);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(result, SerializerFeature.WriteMapNullValue));
    }
}
