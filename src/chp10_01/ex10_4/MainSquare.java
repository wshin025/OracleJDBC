package chp10_01.ex10_4;

public class MainSquare {
    //  Object, Shape, Square 객체의 필드와 메소드를 접근할 수 있다.
    Square square =new Square();


    //Shape 객체의 필드와 메소드 접근가능 (예외적으로 Square 객체의 멤버를 접근 할 수도 있다.)
    Shape shape = new Square();
    //업캐스팅하면 자식클래스의 것을 사용할 수 없다.

}
