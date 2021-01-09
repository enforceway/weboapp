package com.enfo.weboa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String say() {
        return "今天一直下着雪，道路此刻铺满白。";
    }

}
