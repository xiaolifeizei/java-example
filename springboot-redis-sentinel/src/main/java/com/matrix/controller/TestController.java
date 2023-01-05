package com.matrix.controller;

import com.matrix.utils.RedisUtil;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author : cui_feng
 * @since : 2023-01-05 09:49
 */
@RestController
@RequestMapping("test")
@AllArgsConstructor
public class TestController {

    RedisUtil redisUtil;

    public String test() {
        Date now = new Date();
        redisUtil.set("test", now);
        return "success!" + now;
    }
}
