package hearter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	
	@RequestMapping(value = "/test")
	String hello() {
		return "Hello World!";
	}
	
}