package com.jilinwula.springcloudclient;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("userinfo")
public class UserInfo {
    private String username;
    private String password;
}
