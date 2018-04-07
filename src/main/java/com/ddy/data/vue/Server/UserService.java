package com.ddy.data.vue.Server;


import com.ddy.data.vue.Model.roles.UserEntity;

public interface UserService {

    UserEntity getPerson(String name);

    String getToken(String username, String password);

    //根据唯一token获取权限
    String getUserInfo(String token);

    String logout();
}
