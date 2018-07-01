package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRun {
    /**
     * springboot入口函数
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(AppRun.class,args);
        System.out.println("server run success!");
    }
}
