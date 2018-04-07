package com.ddy.data.vue.Server.impl;

import com.ddy.data.vue.Mapper.UserInfoMapper;
import com.ddy.data.vue.Model.roles.UserEntity;
import com.ddy.data.vue.Server.UserService;
import com.ddy.data.vue.Utils.checkString.JsonUtils;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceimpl implements UserService {

//    @Autowired
//    UserInfoMapper userDao;


    @Override
    public UserEntity getPerson(String name) {
        //return (userDao.getUsers(name)==null)?new UserEntity():userDao.getUsers(name);
        UserEntity userEntity=new UserEntity();
        return userEntity;
    }

    @Override
    public String getToken(String username, String password) {
        String token="token";
                //userDao.getToken(username,password);
        Map data=new HashMap();
        data.put("code",20000);
        Map data2=new HashMap();
        data2.put("token",token);
        data.put("data",data2);
        return JsonUtils.MapToJsonString(data);
    }


    @Override
    public String getUserInfo(String token) {
        UserEntity userEntity= new UserEntity();
                //userDao.getUserInfo(token);
        Map userinfo=new HashMap();
        Map data=new HashMap();
        List roles=new ArrayList();
        roles.add("manager");
        data.put("roles",roles);
        List role=new ArrayList();
        role.add("super_manager");
        data.put("role",role);
        data.put("name","大大叶");
        data.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        userinfo.put("code",20000);
        userinfo.put("data",data);
        return JsonUtils.MapToJsonString(userinfo);
    }

    @Override
    public String logout() {
        Map logout=new HashMap();
        logout.put("code",20000);
        logout.put("data","success");
        return JsonUtils.MapToJsonString(logout);
    }
}
