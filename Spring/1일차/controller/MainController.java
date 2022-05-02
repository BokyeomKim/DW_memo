package com.example.first_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
// ctrl + shift + o
//@controller : url 을 요청받는 곳 어노테이션
@RestController
public class MainController {
	
	@GetMapping("/index")
	public String call(){// index하는 주소를 요청하면 call()메소드를 실행
		String word = " 준수 Helloworld ";
		return word;
	}
@GetMapping("/sum")
//http://localhost:8080/sum
public int callSum() {
	int x =10;
	int y = 20;
	return x + y; 
}

}