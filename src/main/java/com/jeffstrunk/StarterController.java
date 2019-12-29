package com.jeffstrunk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/")
public class StarterController {

	@RequestMapping("/")
//	@ResponseBody
	public String greet() {
		return "I live";
	}
	
	@RequestMapping("/products")
//	@ResponseBody
	public String test() {
		return "/products reached";
	}
}
