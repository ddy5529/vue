package com.ddy.data.vue.Mapper;

import com.ddy.data.vue.Model.roles.UserEntity;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

//@Mapper
//@Component
public interface UserInfoMapper
        //extends MyMapper<UserEntity>
         {

    String getToken(String username, String password);

    UserEntity getUserInfo(String token);
}
