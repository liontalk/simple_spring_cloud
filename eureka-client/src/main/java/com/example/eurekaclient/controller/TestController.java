package com.example.eurekaclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/test")
public class TestController {


    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/v1")
    public String index(@RequestParam(value = "name", defaultValue = "zhouzhe") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
