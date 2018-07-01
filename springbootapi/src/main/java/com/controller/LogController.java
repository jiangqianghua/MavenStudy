package com.controller;

import com.springboot.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    private Logger logger;

    @RequestMapping("/save")
    public String saveLog(String log){
        return logger.log(log);
    }


}
