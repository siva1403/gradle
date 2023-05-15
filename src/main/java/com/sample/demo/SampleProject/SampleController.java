package com.sample.demo.SampleProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/")
	public String printHelloWorld() {
		return "Hello world";
	}

}
