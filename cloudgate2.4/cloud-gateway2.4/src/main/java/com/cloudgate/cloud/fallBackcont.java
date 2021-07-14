package com.cloudgate.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fallBackcont {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User servive is taking longer than Expected."+" Please try again later.";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "Department servive is taking longer than Expected."+" Please try again later.";
	}
}
