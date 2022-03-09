package com.mj.casclient.user.controller;

import com.mj.casclient.user.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("getUser")
    public User getUser(){
        return new User("majing","secret");
    }
}
