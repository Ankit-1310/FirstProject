package com.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorRestController {
	@GetMapping("/")
	public String getMsg() {
		return "Welcome to Actuator Concept";
	}
}
