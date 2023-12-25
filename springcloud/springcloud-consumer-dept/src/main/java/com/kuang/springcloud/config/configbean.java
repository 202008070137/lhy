package com.kuang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configbean {
    //配置负载均衡
    @Bean
    @LoadBalanced  //Ribbon 负载均衡
    public RestTemplate getresttemplate()
    {
        return new RestTemplate();
    }


}
