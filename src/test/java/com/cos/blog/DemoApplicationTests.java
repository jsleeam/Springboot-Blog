package com.cos.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootTest
@RestController
class DemoApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}
//	@GetMapping("/test/hello")
//	public String hello() {
//		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
//		return "<h1>hello spring boot</h1>";
//	}
//
	@GetMapping("/test/hello")
	public String hello2() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
		return "<h1>hello spring boot</h1>";
	}

}
