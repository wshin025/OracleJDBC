package ex08.ex08_09;

public class Cmain {

    public static void main (String[]args){
        Coffee c = new Coffee("아0메리카노",3000);
        System.out.printf("%s(%d원) =>", Coffee.getName(), Coffee.getPrice);
//기존커피가격+ 500원 인상된값 설정
        Coffee.setPrice(Coffee.getPrice()+500);
        System.out.printf("%s(%d원) =>", Coffee.getName(), Coffee.getPrice);
    }
}
