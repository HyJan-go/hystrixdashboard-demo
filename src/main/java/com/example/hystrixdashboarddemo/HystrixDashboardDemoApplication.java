package com.example.hystrixdashboarddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * https://juejin.im/post/5d88cb58f265da03e4679eff
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
public class HystrixDashboardDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardDemoApplication.class, args);
    }

}
