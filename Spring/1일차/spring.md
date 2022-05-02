### 05월 02 일 


JavaScript -> Node.js
python -> flask, 장고
c ->asp
java ->Spring



spring을 배우는 이유?
spring 은 검증된 툴이다.
검증되었으니 회사에서 spring 을 사용.
회사에서도 spring 을 사용하는 개발자를 원함
교육 기관에서도 spring 베이스 교육

결론 : 수요가 많음

spring 이란?
Java로 다양한 어플리케이션(웹 or 앱)을 만들기 위한 *틀(프레임워크)

쉽게 생각해서.. !!
플랫폼(spring) -> 프레임워크
<!-- spring 은 프레임 워크! -->

spring 종류 
1. spring 레거시(일반 spring)
2. spring boot (경량 spring)
3. spring 전자정부프레임워크(egov)

*****중요 spring 하고 같이 사용하는 친구들 ~~~

spring 만으로 어플리케이션을 개발하는데 한계
데이터베이스 , 고객에게 보여줄 화면 필요 등등 ... 



1. 데이터베이스 연결과 데이터 생성, 호출, 삭제, 수정을 도와주는 *ORM
    -MyBatis(v), JPA


2. 필요한 기능을 쉽게 다운로드 받을 수 있고, 서버에 업로드(배포)를 도와주는 
    *빌드관리도구(Build Tool)
    -Gradle(v), Maven
    
3. 화면을 도와주는 템플릿 엔진!
    -JSP , Thymeleaf(v)

4. 속성 정의(데이터베이스 주소, 아이디 , 비번 )를 담당하는 속성 파일!
- yaml(야믈)(v),  properties

5. 서버를 담당하는 Tomcat(v)!

6. (optional) 그 외 Docker, GraphQL 


https://start.spring.io 북마크★

설치방법>
구글 -> sts 검색 -> 스프링 공식 홈 접속


회사가서
이클립스 or sts (IDE)

1.한글 설정

상단바 window -> preperence -> encoding 검색 

text file incoding ->other - > UTF-8 (이 작업 안해주면 한글꺠짐)

general - font

https://start.spring.io/
> gradel project
> JAVA
> version (default)

Artifact>
first_spring (project name)
버전이 높은것 사용 못하니 11ㅡ 8 버전 권장
Dependencies ->Spring Web WEB
->generate


C:\workspaces\spring-workspace 여기에 압축풀기
import 

C:\workspaces\spring-workspace\first_spring\src\main\java\com\example\first_spring



****** spring 규칙 *********
패키지 이름은 3개  
스프링은 패키지 3개부터 시작(default)


src / main/java -> new package
<dw> new package
<dw.junsu></dw.junsu> new package 
<dw.junsu.study>
암묵적인 룰 . 
com.example.first_spring
com. xxx. www


ex.)
com.dw.board 



네이버를 패키지 >
com.naver.
<!-- www -->
kr.회사이름.
첫번쨰 패키지 : com,io,kr 등등..
두번쨰 패키지 : 회사이름
세번쨰 패키지 : 프로젝트명  www (x) 쓰는게 아니라 프로젝트!
패키지 안에 패키지 만들수있다(펄더)




com.example.first_spring.controller
//패키지 4개 
//클래스 만들기 <MainController> , 메인은 별도로 만들지 않는다.
----패키지 생성----------------------
package com.example.first_spring.controller;

import org.springframework.stereotype.Controller; 

@Controller
//@

public class MainController {

}
-------------------------------





----------------------------------
안뜨는 경우 : 콘솔창 컴퓨터 모양 눌러서 첫번째 거 중지 누르기 
이유 : 8080 을 쓰고 있어서
----------------------------------
구글 >devtools gradle 검색
    compileOnly("org.springframework.boot:spring-boot-devtools")복붙 
<code>붙여넣기 위치 

build.gradel >dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-web'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	compileOnly("org.springframework.boot:spring-boot-devtools") //서버 자동으로 재시작
}
--------------------------------------
새로고침 : build.gradel > refresh
------------------------------------
1.controller 패키지 생성
controller : url 요청을 받는곳

***2. http?
GET : 요청, 조회?
