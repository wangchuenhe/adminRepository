package com.entity;

public class User {
    private  String username;
    private  String password;
    private  Integer age;

    public Integer getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
