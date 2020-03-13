package com.sample.samplemavenrepo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHome {
    @GetMapping("/")
    public String sayHello() {
        return "Hello, I am test project";
    }
}
