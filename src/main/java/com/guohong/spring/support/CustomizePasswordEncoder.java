package com.guohong.spring.support;

import org.apache.commons.codec.Charsets;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author guohong
 */
public class CustomizePasswordEncoder implements PasswordEncoder {


    @Override
    public String encode(CharSequence rawPassword) {
        String data = (String) rawPassword;
        //设置加密方式
        return data;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(rawPassword);
    }
}
