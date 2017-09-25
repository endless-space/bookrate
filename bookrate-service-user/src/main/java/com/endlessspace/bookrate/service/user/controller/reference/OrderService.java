package com.endlessspace.bookrate.service.user.controller.reference;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("bookrate-service-order")
public interface OrderService {

    @GetMapping("/consumer")
    String consumer();
}
