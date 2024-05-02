package com.boot.config.listener;

import com.boot.domain.MessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Date 2024/05/02 14:27:00
 **/
@Slf4j
@Component
public class RedisMessageListener implements MessageListener {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void onMessage(Message message, byte[] pattern) {

        // 接收的topic
        log.info("channel:" + new String(pattern));

        //序列化对象（特别注意：发布的时候需要设置序列化；订阅方也需要设置序列化）
        MessageDto messageDto = (MessageDto) redisTemplate.getValueSerializer().deserialize(message.getBody());
        log.info(messageDto.getData()+","+messageDto.getContent());
    }
}
