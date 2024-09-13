package com.ion.entity;


public class User {
 private int id;
 private String loginname;
 private String password;
 private String username;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getLoginname() {
    return loginname;
}
public void setLoginname(String loginname) {
    this.loginname = loginname;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}
public User(int id, String loginname, String password, String username) {
    this.id = id;
    this.loginname = loginname;
    this.password = password;
    this.username = username;
}
@Override
public String toString() {
    return "User [id=" + id + ", loginname=" + loginname + ", password=" + password + ", username=" + username + "]";
}
 
}

