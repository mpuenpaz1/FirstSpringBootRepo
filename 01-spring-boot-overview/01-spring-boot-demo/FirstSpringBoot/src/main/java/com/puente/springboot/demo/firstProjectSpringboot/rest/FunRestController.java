package com.puente.springboot.demo.firstProjectSpringboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return "HELLO world!" ;
    }

    @GetMapping("/fortune")
    public String getDailyWorkout() {
        return "today is your lucky day. ";
    }
}
