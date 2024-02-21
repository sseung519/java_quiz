package ch06.quiz22;

public class Account {

    private int balance;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        //매개값이 음수이거나 백만원을 초과하면 현재 balance 값을 유지
        if(balance < MIN_BALANCE || balance > MAX_BALANCE) return;
        this.balance += balance;
    }

}