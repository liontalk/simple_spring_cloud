package cn.liontalk.serviceribbon.controller;


import cn.liontalk.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/hello")
@RestController
public class HelloController {


    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/ribbon")
    public String sayHello(@RequestParam("name") String name) {
        return helloService.hiService(name);
    }


}
