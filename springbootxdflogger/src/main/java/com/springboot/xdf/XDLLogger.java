package com.springboot.xdf;

import com.springboot.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class XDLLogger implements Logger {

    @Value("${spring.xdf.logger.xdf-path}")
    private String path ;
    @Override
    public String log(String log) {
        //String info = "xdf log is " + log ;
        String info = "xdf log is " + log + " path is "+ path;
        System.out.println(info);
        return info;
    }
}
