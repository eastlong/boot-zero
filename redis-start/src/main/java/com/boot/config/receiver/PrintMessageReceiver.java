package com.boot.config.receiver;

import com.boot.domain.MessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Date 2024/05/02 14:28:00
 **/
@Slf4j
@Component
public class PrintMessageReceiver {
    @Autowired
    private RedisTemplate redisTemplate;

    public void receiveMessage(MessageDto messageDto , String channel) {

        // 接收的topic
        log.info("channel:" + channel);

        log.info("message:" + messageDto.getTitle());
    }
}
