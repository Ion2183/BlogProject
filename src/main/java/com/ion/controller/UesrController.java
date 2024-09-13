package com.ion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ion.mapper.userMapper;

@Component
public class UesrController {
    @Autowired
    private userMapper usermapper;
    
    public String getPasswordByUsername(String username){
        return usermapper.getUserbyUsername(username).getPassword();
    } 

}
