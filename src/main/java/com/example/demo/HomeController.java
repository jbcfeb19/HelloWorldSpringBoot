package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/index2")
    public String getIndex2(){
        return "index2";
    }


    @GetMapping("/bslesson")
    public String getBSLesson(){
        return "bslesson";
    }
}
