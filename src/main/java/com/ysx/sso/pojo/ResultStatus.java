package com.ysx.sso.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ResultStatus {

    SUCCESS(200, "成功"),

    NOT_LOGIN(500501, "用户未登录"),
    FORBIDDEN(500502, "未授权的访问"),
    LOGIN_FAIL(500503, "登录失败");

    private Integer code;
    private String message;

}
