package ch13.Quiz03;

public class UtilExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>( "홍길동" , 35 );
        Integer age = Util.getValue(pair, "홍길동" ); //key는 홍길동
        System.out.println(age);

    }
}
