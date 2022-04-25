package 스태틱;

//static 이 없는 클래스

public class Chef2 {
    static Chef2 c2;}

    public static chef2 getInsatance() {

        c2 = new chef2();
        return c2;

    }

    public void printHello() {

        System.out.println("Hello world");
        ;
    }
}