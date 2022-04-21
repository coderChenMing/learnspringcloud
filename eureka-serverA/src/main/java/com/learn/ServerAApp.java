package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Project: learnspringcloud
 * File Created at 2022-04-21 14:52:14:52
 * {@link}
 *
 * @author <a href="mailto:charmFlightChen@gmail.com">chenming</a>
 * @version 1.0.0
 * @Type ServerAApp.java
 * @Description
 * @date 2022/4/21 14:52
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerAApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerAApp.class, args);
    }
}
