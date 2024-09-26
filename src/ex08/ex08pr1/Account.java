package ex08.ex08pr1;

public class Account {
    private String name;
    private int balance;



    public Account(String n, int b) {
    this.name = n;
    this.balance = b;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }


//   조건식을 만든다 transfers 계좌이체
    public boolean transfer(Account account, int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족하여 이체가 불가능!!");
            return false;
        } else {
            balance = balance - amount;
            System.out.println("송금이 완료 되었습니다.");
            return true;
        }
    }
}
