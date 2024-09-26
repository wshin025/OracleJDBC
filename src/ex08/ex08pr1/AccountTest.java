package ex08.ex08pr1;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("123-45",10000);
        Account b = new Account("567-89",10000);

        while (a.transfer(b,3000)){
            System.out.println("A계좌에서 B계좌로 송금이 되었습니다.");
        }
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
