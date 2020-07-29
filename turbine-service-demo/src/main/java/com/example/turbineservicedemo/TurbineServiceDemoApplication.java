package com.example.turbineservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 使用 @EnableTurbine 来开启turbine
 * https://juejin.im/post/5d88cb58f265da03e4679eff
 */
@EnableTurbine
@EnableDiscoveryClient
@SpringBootApplication
public class TurbineServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineServiceDemoApplication.class, args);
    }

}
