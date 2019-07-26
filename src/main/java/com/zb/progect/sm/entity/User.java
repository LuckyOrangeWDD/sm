package com.zb.progect.sm.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {

    private int id;
    private String userName;
    private String userPassword;
    private String gender;
    private String phone;
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private String birthday;
    private String address;
    private Role role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", role=" + role +
                '}';
    }
}
