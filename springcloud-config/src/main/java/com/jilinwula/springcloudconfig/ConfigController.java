package com.jilinwula.springcloudconfig;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @PostMapping("/sync")
    public Object sync() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("code", 0);
        return map;
    }
}
