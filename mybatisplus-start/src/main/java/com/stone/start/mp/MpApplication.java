package com.stone.start.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description:
 * @Author wu.xl
 * @Date 2023/06/22 16:13:00
 **/
@SpringBootApplication
@MapperScan("com.stone.start.mp.dal.mapper")
@EnableSwagger2
public class MpApplication {
    public static void main(String[] args) {
        SpringApplication.run(MpApplication.class, args);
    }
}
