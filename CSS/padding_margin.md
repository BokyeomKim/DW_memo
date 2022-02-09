꿀팁) auto rename, close

css

1. position\*

- static : 돌 (디폴트)
- relative : 원래 기준에서 움직임
- absolute : 자기 마음대로 움직임
  조건) 부모태그 position 이 relative 면
  부모 태그 기준으로 움직임.
- fixed : 고정(스크롤 내릴때 마다 계속 따라옴.)

<div>//부모태그
	<div><div/> // 자식태그
</div>
2. (margin, padding) , box -size

-div(박스 태그)
(공통점) 박스 간격 조절
margin :부모박스와 부모박스 간격 조절
padding : 부모박스 안에 있는 \*자식 박스 간격 조절

padding 작성 법 :
-padding : 10px; // 동서남북 모두 10px 패딩.
-padding : 5px (위), 10px(오른쪽&왼쪽), 0(아래); //
-padding : 5px(위&아래) 10px(오른쪽&왼쪽);
-padding : 10px(위) 10px(오른쪽) 10px(아래쪽) 10px(왼쪽) //시계방향

padding : 자식태그와 거리두기
부모태그 css padding 작성~
margin : 부모와 부모 거리두기
부모 태그 css margin 작성~

-margin : 10px; // 동서남북 모두 10px 패딩.
-margin : 5px (위), 10px(오른쪽&왼쪽), 0(아래); //
-margin : 5px(위&아래) 10px(오른쪽&왼쪽);
-margin : 10px(위) 10px(오른쪽) 10px(아래쪽) 10px(왼쪽) //시계방향

style.css 파일 에 스타일 저장 후 호출
link

3. (flex)
   기타 ) 반응형
