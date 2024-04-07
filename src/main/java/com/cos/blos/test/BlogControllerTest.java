package com.cos.blos.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
}
