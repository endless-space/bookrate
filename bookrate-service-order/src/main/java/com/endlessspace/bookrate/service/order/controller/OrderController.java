package com.endlessspace.bookrate.service.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	
	/**
	 * 描述: 负载均衡Client, 使用Robbin之后可以不用显式声明
     * LoadBalancerClient loadBalancerClient;
	 */

    @Autowired
    RestTemplate restTemplate;
    
    @GetMapping("/consumer")
    public String dc() {
        return restTemplate.getForObject("http://bookrate-service-book/dc", String.class);
    }
}
