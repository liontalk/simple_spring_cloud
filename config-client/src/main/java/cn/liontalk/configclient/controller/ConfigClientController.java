package cn.liontalk.configclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/config")
public class ConfigClientController {


    /**
     * 端口 8888是个坑
     */

    @Value("${foo}")
    private String foo;


    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }

}
