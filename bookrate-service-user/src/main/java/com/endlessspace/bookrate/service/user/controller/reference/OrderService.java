package com.endlessspace.bookrate.service.user.controller.reference;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "bookrate-service-order", fallback = OrderServiceFallback.class)
public interface OrderService {

    @GetMapping("/consumer")
    String consumer();
}
