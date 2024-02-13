package ch04;

public class Quiz08 {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            i+= i;
            System.out.print(i);
            for(int t=1; t<=5; t++){
                t+=t;
            }
            System.out.println(i);
        }
    }
}
