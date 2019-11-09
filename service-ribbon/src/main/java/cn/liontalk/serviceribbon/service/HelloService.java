package cn.liontalk.serviceribbon.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {


    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "hasError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client/test/v1?name=" + name, String.class);
    }


    public String hasError(String name) {
        return "Hi," + name + "Occur Error";
    }

}
