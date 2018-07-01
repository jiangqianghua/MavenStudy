package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/index")
    public String index(String name, Model model){
        model.addAttribute("name",name);
        return "index";
    }
}
