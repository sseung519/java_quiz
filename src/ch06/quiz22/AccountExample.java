package ch06.quiz22;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());
//현재 잔고: 10000

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());
//현재 잔고: 10000

        account.setBalance(2000000);
        System.out.println("현재 잔고: " + account.getBalance());
//현재 잔고: 10000

        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance());

    }
}