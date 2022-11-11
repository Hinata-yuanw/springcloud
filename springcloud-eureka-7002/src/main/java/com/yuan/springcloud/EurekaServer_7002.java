package com.yuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaServer_7001
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/11/3-14:47
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7002.class, args);
    }

}
