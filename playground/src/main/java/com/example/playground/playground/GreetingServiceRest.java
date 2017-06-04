package com.example.playground.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dorom on 31.05.2017.
 */
@RestController
public class GreetingServiceRest {

    @GetMapping("/greet")
    public String greet() {
        return "Hello!";
    }
}
