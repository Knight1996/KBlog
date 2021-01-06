package com.knight.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author : Knight
 * @program : blog
 * @description :
 * @date : 2021-01-05 14:03
 **/
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

}
