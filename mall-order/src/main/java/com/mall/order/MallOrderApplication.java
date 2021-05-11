package com.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.TimeZone;

/**
 * @author zjt
 * @date 2021-04-15
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MallOrderApplication {

    public static void main(String[] args) {

        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));

        SpringApplication.run(MallOrderApplication.class, args);

    }

}