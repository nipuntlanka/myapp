package com.nipun.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/starlink/")
public class CcApplication {

	@RequestMapping(value = "testget", method = RequestMethod.GET)
	public String testget(){
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(CcApplication.class, args);
	}

}
