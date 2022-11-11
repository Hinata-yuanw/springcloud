package com.yuan.springcloud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ConfigBean
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/11/2-17:30
 * @Version: 1.0
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //配置负载均衡实现RestTemplate

}
