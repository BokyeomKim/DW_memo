#꼭 외우기 HTML 태그
1. 링크태그 (사이트 이동) : a 태그<a></a>

2.대, 중, 소 제목 태그 : h1~ h6 
뒤에 숫자가 커질수록 폰트크기는 작아짐!

3. 입력 text 태그 : input type = text

4. 입력 비밀번호 태그 : input type = password

5.버튼 태그 : button , input type = button
두가지 사용방법 

#table 태그 (게시판)
<table>
  <thead>//테이블 제목(컬럼)
	<tr>
	<th>이름</th>
	<th>나이</th>
	</tr>
  </thead>

  <tbody>// 제목(컬럼)에 해당되는 데이터 
	<tr>
	<td>홍길동</td>
	<td>30</td>
	</tr>
  </tbody>
</table>

----------------------------------------------
#ul 태그, li 태그
<ul> //Unorder List
     <li><a href =  "쇼핑몰 주소">상의</a>	
     </li> List Item
     <li>하의</li>
     <a href =  "쇼핑몰 주소">하의</a>
     </li> 
     <li>신발</li>
     <li>모자</li>
</ul>



#ol 태그
<ol> Order List
 <li>JAVA<li>
 <li>Python<li>
 <li>HTML<li>
 <li>SQPL<li>
</ol>



#div 태그

꿀팁!
 div *3 
F12 눌러서 스마트폰 크기로 화면을 맞출수도 있다.


css : 
태그마다 position 을 가지고 있음.
position  디폴트 값이 static.

1.static(디폴트) : 위치를 지정하지 않을 때.
2.relative : 원래 자리 기준으로 움직임.