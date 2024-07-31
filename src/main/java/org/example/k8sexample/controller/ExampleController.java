package org.example.k8sexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {


    @GetMapping("/call")
    public String getCall() {

        return "Hello World";
    }
}
