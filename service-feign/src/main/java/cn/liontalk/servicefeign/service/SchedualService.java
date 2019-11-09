package cn.liontalk.servicefeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client")
public interface SchedualService {


    @GetMapping(value = "/test/v1")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
