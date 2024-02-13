package ch04;

public class Quiz07 {
    public static void main(String[] args) {
        int num1= 1;
        int num2 = 1;
        int num3 = 0;

        for (int i = 3; i<=10; i++){
            num3= num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(num3);
    }
}
