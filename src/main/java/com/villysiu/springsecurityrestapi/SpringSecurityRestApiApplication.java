package com.villysiu.springsecurityrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringSecurityRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityRestApiApplication.class, args);
    }

}
