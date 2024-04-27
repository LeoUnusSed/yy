package com.hypech.yysb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController = @Controller + @ResponseBody
@RestController 
public class BasicController {
	
	@GetMapping(value = "")
	public String index() {
		return "login"; // 此处表示返回值是一个值为“login”的String。不指向界面的原因是类的注解是@RestController
	}

}
