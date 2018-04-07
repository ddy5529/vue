package com.ddy.data.vue.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @JoinColumn(name = "id")
    private int id;

    @JoinColumn(name = "name")
    private String name;
    @JoinColumn(name = "age")
    private  int age;
    @JoinColumn(name = "address")
    private String address;
    @JoinColumn(name = "phone")
    private String phone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
