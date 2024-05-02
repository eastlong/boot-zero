package com.boot.controller;

import com.boot.RedisUtil;
import com.boot.domain.MessageDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description:
 * @Date 2024/05/02 15:26:00
 **/
@Slf4j
@Controller
public class TestController {
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/publish")
    @ResponseBody
    public String test(){
        final String TOPIC_NAME1 = "t1"; // 订阅主题
        final String TOPIC_NAME2 = "t2"; // 订阅主题
        // 发布消息
        MessageDto dto = new MessageDto();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        dto.setData(timeFormatter.format(now));
        dto.setTitle("日常信息");
        dto.setContent("hello world!");

        redisUtil.convertAndSend(TOPIC_NAME1, dto);


        return "Success";

    }
}
