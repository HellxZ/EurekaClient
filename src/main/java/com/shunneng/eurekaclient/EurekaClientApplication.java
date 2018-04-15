package com.shunneng.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EurekaClient
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaClientApplication {

    @RequestMapping("/hello")
    public String index(){
        return "hello eureka client";
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
