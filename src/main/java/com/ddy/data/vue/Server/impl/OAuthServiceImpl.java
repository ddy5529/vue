package com.ddy.data.vue.Server.impl;

import com.ddy.data.vue.Server.OAuthService;

public class OAuthServiceImpl implements OAuthService {
    @Override
    public String judgeuserbyup(String username, String password) {
        /*
        * 判断用户是否存在此账号，若是存在则返回一个随机码，若是不存在则返回错误码。
        * 设置一张表用来存储用户token信息，此表结构为token为主键（不递增，通过算法生成一个与时间戳和随机的四位字节码相关的字符串，如项目代号+时间戳+随机码），
        * 用户信息表的ID（此处需要加密），token开始时间（此处需要设置一个每隔一个定时时间（5*60）就刷新一次的定时器去更新这张表的信息，检测开始时间和当前时间是否满足隔一个刷新时间（如25*3600），如果已经满足条件就去更新一次此用户的toekn）
        * */
        return null;
    }
}
