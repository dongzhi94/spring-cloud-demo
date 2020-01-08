package com.dongzhi.spring.cloud.userserviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceConsumerApplication.class, args);
	}

	/**
	 * 声明restTemplate bean，LoadBalanced使用负载均衡，只需要指定应用的名称
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
