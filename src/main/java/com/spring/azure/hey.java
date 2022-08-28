package com.spring.azure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hey {
	
	@RequestMapping("/hi")
	public String hi()
	{
		return "Hello";
	}

}
