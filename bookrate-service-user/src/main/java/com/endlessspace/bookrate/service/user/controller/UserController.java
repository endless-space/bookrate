package com.endlessspace.bookrate.service.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endlessspace.bookrate.service.user.controller.reference.OrderService;

@RestController
public class UserController {
	@Autowired
	OrderService orderService;

	@GetMapping("/aconsumer")
	public String dc() {
		return orderService.consumer();
	}
}
