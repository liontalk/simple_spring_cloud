package cn.liontalk.servicefeign.controller;


import cn.liontalk.servicefeign.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/feign")
public class HelloController {



    @Autowired
    private SchedualService schedualService;


    @GetMapping("/hi")
    public String sayHi(@RequestParam("name")String name){
     return  schedualService.sayHiFromClientOne(name);
    }



}
