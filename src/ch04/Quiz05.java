package ch04;

public class Quiz05 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++){
            for(int y = 1; y <= 10; y++) {
                //4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드를 작성
                if(4*x + 5*y == 60){
                    System.out.println("x:" + x +" "+ "y:" + y);
                }
            }
        }

    }
}
