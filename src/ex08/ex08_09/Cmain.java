package ex08.ex08_09;

// Cmain.java
public class Cmain {
    public static void main(String[] args) {
        Coffee c = new Coffee("아메리카노", 3000);
        System.out.printf("%s(%d원) => ", c.getName(), c.getPrice());
        c.setPrice(c.getPrice() + 500);
        System.out.printf("%s(%d원) => ", c.getName(), c.getPrice());
    }
}

