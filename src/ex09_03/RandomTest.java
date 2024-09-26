package ex09_03;
import java.util.Random;
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int n =10;

       System.out.printf("임의의 정수 : %d\n",random.nextInt());
       System.out.printf("0이상 9사이의(%d)미만의 임의 정수 : %d\n",n,random.nextInt(10));
        System.out.printf("1이상 10미만의 임의 정수 : %d\n",n,random.nextInt(10)+1);
       System.out.printf("임의의 실수: %f\n",random.nextDouble(100));
       System.out.printf("임의의 참/거짓: %b\n",random.nextBoolean());
    }
}
