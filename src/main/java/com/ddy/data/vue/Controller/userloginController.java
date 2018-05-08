package com.ddy.data.vue.Controller;

import com.ddy.data.vue.Model.RequestLoginBean;
import com.ddy.data.vue.Server.UserService;
import com.ddy.data.vue.Utils.checkString.StringUtils;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api("用户权限")
@RestController
@RequestMapping("/user")
public class userloginController {

    @Autowired
    UserService userService;

//    @RequestMapping(name = "login",method = "OPTIONS")
//    public String login(){
//        return "";
//    }

    @ApiOperation("获取用户验证信息")
    /*@ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "username",dataType = "String",required = true,value = "用户口令",defaultValue = "zhangsan"),
            @ApiImplicitParam(paramType = "query",name = "password",dataType = "String",required = true,value = "用户密钥",defaultValue = "123456")}
    )*/
    @ApiResponses({
            @ApiResponse(code = 400,message = "请求的参数错误"),
            @ApiResponse(code = 404,message = "请求的路径不存在或错误"),
    })
    @PostMapping("/login")
    public String judgeUserLogin(@RequestBody RequestLoginBean loginBean){
        //修饰参数的有：@RequestBody @RequestParam @PathVariable
        String token= userService.getToken(loginBean.getUsername(),loginBean.getPassword());
        if (StringUtils.isEmptyString(token)){
            token="this string is null! ";
        }
        return token;
    }

    @ApiOperation("通过token获取用户的信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "token",dataType = "String",required = true,value = "用户Token信息",defaultValue = "12345678901")
            })
    @ApiResponses({
            @ApiResponse(code = 400,message = "请求的参数错误"),
            @ApiResponse(code = 404,message = "请求的路径不存在或错误"),
    })
    @GetMapping("/info")
    public String getUserInfo(@RequestParam("token") String token){
        String userinfo=userService.getUserInfo(token);
        if (StringUtils.isEmptyString(token)){
            userinfo="this string is null! ";
        }
        return userinfo;
    }

    @PostMapping("/logout")
    public String logout(){
        String logout=userService.logout();
        return logout;
    }
}
