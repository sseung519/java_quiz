package ch04;

public class Quiz04 {
    public static void main(String[] args) {
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
            if ((num1 + num2 == 5)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

}

