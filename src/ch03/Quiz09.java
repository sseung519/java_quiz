package ch03;

public class Quiz09 {
    public static void main(String[] args) {
        int x = 100;
        String num = (x < 0) ? "음수" : ((x > 0) ? "양수" : "0" );
        System.out.println(num);
    }
}
