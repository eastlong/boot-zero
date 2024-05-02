package com.boot.domain;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description:
 * @Date 2024/05/02 14:16:00
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MessageDto implements Serializable {
    private String data;
    private String title;
    private String content;
    String a = "{\"data\":\"123456\", \"title\":\"redis\", \"content\":\"HelloWorld\"}";
}
