package com.yancy.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yancy0109
 */

@EnableFeignClients(basePackages = "com.yancy.mall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class MallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class);
    }
}
