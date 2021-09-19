package com.atguigu.springcloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dengbinsheng
 * @date 2021/9/19 10:30
 */
//@Configuration
@SpringBootConfiguration
public class ApplicatinContextConfig {
    @Bean
    @LoadBalanced  //通过注册中心获取服务列表，远程调用采用负载均衡（LB）
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
