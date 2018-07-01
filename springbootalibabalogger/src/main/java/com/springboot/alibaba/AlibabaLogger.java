package com.springboot.alibaba;

import com.springboot.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 阿里巴巴实现的log协议
 */
@Component
public class AlibabaLogger implements Logger {

    @Value("${spring.alibaba.logger.alibaba-path}")
    private String path ;
    @Override
    public String log(String log) {
        //String info = "alibaba log is "+ log;
        String info = "alibaba log is " + log + " path is "+ path;
        System.out.println(info);
        return info;
    }
}
