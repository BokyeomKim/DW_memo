```java
package 스태틱;

//로직
public class Chef {
    private static Chef chef = null; // 스태틱으로 선언된 클래스 변수

    public static Chef getInstance() { // 스태틱으로 선언된 메소드
        if (chef == null) {// 미리 인스턴스화
            chef = new chef();
        }
        return chef; // 클래스 초기값이 null 이라서 가능하다.
    }

}

    // Chef.getInsatance() 인스턴스화 가 된 메소드를 스태틱으로 공유함.
    // Chef c = new Chef() 가 가능해진다.

    // Class A
    // static 목적 공유한다.
    // static x(공유)
    // A a1 = new A()
    // Aaz = new A()

    // 참고하고 있는 값들이 모두 바뀐다.
    // 공유는 하는데 값이 변하지 않는 애들을 static 선언
    // 값이 안바뀌는 애들 을 선언한다.

    // 진단코드 , 질병코드 > 변하지 않는다.
    // 감기 걸려 병원에 갔는데 ex. AA123
    // static int count;
    // public static final String GAMGI = "AA123";
    // 안바뀌는것을 정의 . 여러 클래스에서 공유 한다.

    // *final : 상수 ,안 바뀌는것
    // 클래스 파일을 따로 만들고 가져다 쓴다.
    // 수정을 여기서 해서 바뀌게한다.

    // //스태틱으로 선언된 변수, 메소드는 new (인스터스화를 안해도)사용할 수있다.
    // 호출이 가능하다. 코드가 많은 프로젝트 같은 경우 많다.
    // syso.out.println (StaticStudy.GAMGI)
    // "."으로 접근이 가능하다

    // 변하지 않는 값들은 대문자를 사용 한다.
    // StaticStudey s2 = new StauticStudy();

    // 변수
    // static 변수
    // non-static 변수 로 나뉘어 진다.

    // 싱글톤 패턴
    // =코딩도 디자인 패턴이 있다. 코딩 디자인 패턴중 하나!
    // 싱글톤은 스태틱 개념을 응용함!

    // 주로 공통된 객체(클래스 )를 여러개 생성해서 사용하는 상황에서 많이 사용.
    // 싱글톤은 여러차례 호출되더라도 실제로 생성되는 객체(클래스)는 하나이다.

    // Heap 이 꽉차게 되면 서버가 다운된다.
    // 해결방법 . 싱글톤 패턴을 이용해서 해결하는 방법

    // 서로 다른 클래스에서 chef 많이 사용 하게 될 경우..
    // Chef c = chef.getInstance();
    // 로 공유 한다.

    // 스태틱을 지우게 되면 , 오류가 난다. 해결방법은 new 를 만드는것. 스태틱을 사용해서 new 로 접근.

    public void printHello() {
        System.out.println("Hello World!");
    }
}
// static을 저장하는영역 이 따로 있다.

// 결론 : static 을 사용하는 경우
// ★★★★★★ 1. 코드를 정의할 때 ★★★★★★ 2번은 잘 사용 안함.
// 단, 해당 클래스에는 변수만 존재

// 2. 객체를 여러개 생성해서 사용하는 상황일 때(싱글톤 패턴)
// ex.) 데이터베이스 연동할 때

// 다 만들어져 있어서 가져다쓰지 , 구현 할 필요는 없다.

// new 로 생성된것이 Heap 로 저장된다.
// Heap, Static 이 별도로 있다는 것을 알아야 함.
```
