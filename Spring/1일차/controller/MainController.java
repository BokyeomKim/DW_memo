package com.example.first_spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_spring.VO.UserVO;

@Controller
// ctrl + shift + o
//@controller : url 을 요청받는 곳 어노테이션
@RestController
public class MainController {

	@GetMapping("/index")
	public String call() {// index하는 주소를 요청하면 call()메소드를 실행
		String word = " 준수 Helloworld ";
		return word;
	}

	@GetMapping("/sum")
//http://localhost:8080/sum
	public int callSum() {
		int x = 1;
		int y = 999;
		return x + y;
	}

//	@GetMapping("/user")
//	public UserVO callUser() {
//		UserVO vo = new UserVO();
//		vo.setName("홍길동");
//		vo.setAge(20);		
//		return vo;
//		
//	}
	
	@GetMapping("/user")
	public UserVO callUser() {
		UserVO vo = new UserVO("dd",30,"dd");
		return vo;
	}
	
	@GetMapping("/userList")
	public List<UserVO> callUserList(){
		List<UserVO> list = new ArrayList<UserVO>();
		for(int i = 0; i<5; i++) {
			list.add(new UserVO("홍길동",30,"대전"));
		}
		return list;
		
	}
}