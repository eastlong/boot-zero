package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author wu.xl
 * @Date 2023/07/05 10:42:00
 **/
@Controller
public class QuickStartController {
//    @Autowired
//    private RedisTemplate redisTemplate;

    private final RedisTemplate redisTemplate; // 替代 @Autowired

    public QuickStartController(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }


    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        redisTemplate.opsForValue().set("hello", "world");
        String hello = (String) redisTemplate.opsForValue().get("hello");

        return "SpringBoot访问成功";
    }
}
