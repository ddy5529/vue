package com.ddy.data.vue.Model.roles;

import com.mysql.fabric.xmlrpc.base.Data;

public class UserEntity {

    private int user_id;

    private String user_sex;

    private String role_name;

    private String userName;

    private String passWord;

    private String userPhone;

    private String userToken;

    private Data tokenTime;

    private String salt;

    private String identityCard;

    private String identityCardAddress;

    private Data birthday;


    public Data getTokenTime() {
        return tokenTime;
    }

    public void setTokenTime(Data tokenTime) {
        this.tokenTime = tokenTime;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Data getBirthday() {
        return birthday;
    }

    public void setBirthday(Data birthday) {
        this.birthday = birthday;
    }

    public String getIdentityCardAddress() {

        return identityCardAddress;
    }

    public void setIdentityCardAddress(String identityCardAddress) {
        this.identityCardAddress = identityCardAddress;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
