package com.example.first_spring.VO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data	//Getter, Setter or data : getter,setter 함수를 자동으로 만들어 짐
@AllArgsConstructor
public class UserVO {
	private String name;
	private int age;
	private String addr;
	
}

