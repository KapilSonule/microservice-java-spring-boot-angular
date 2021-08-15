package com.kapil.workindashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

	@GetMapping("/health")
	public String health() {
		return "Up and Running";
	}
}
