package com.ysx.sso;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Pattern;

@SpringBootTest
class SpringBootSsoApplicationTests {

    @Test
    void contextLoads() {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$");
        System.out.println(pattern.matcher("ass23@qq.com").matches());
    }

}
