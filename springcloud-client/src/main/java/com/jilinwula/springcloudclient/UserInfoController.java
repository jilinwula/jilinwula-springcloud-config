package com.jilinwula.springcloudclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    private UserInfo userInfo;

    @GetMapping("/get")
    public Object get() {
        return userInfo;
    }
}
