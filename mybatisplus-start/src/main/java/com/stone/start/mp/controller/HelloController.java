package com.stone.start.mp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author wu.xl
 * @Date 2023/06/22 16:30:00
 **/
@RestController
public class HelloController {

    @RequestMapping(value = "/quick", method = RequestMethod.GET)
    public String quick(){
        return "SpringBoot访问成功";
    }
}
