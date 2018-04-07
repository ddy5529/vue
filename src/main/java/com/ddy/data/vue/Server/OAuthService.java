package com.ddy.data.vue.Server;

public interface OAuthService {
    //验证用户信息是否正确，正确则返回一个token，负责返回defeated
    String judgeuserbyup(String username,String password);
}
