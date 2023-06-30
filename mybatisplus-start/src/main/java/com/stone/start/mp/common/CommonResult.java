package com.stone.start.mp.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.io.Serializable;

/**
 * @Description:
 * @Author wu.xl
 * @Date 2023/06/22 21:28:00
 **/
@Data
@Builder
@AllArgsConstructor
public class CommonResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Tolerate
    public CommonResult() {
    }

    private Integer code;
    private String message;
    private T data;

    public static CommonResult ok() {
        return CommonResult.builder().code(200).message("请求成功").build();
    }

    public static CommonResult ok(Object data) {
        return CommonResult.builder().code(200).message("请求成功").data(data).build();
    }

    public static CommonResult error(String message) {
        return CommonResult.builder().code(500).message("响应异常").build();
    }

}

