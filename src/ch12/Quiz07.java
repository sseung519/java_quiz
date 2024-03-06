package ch12;

public class Quiz07 {
    public static void main(String[] args) {
        /*
        7. 숫자 100과 300으로 각각 박싱된 Integer 객체를 == 연산자로 비교한 결과 100을 박싱한
        Integer 객체는 true가 나오지만, 300을 박싱한 Integer 객체는 false가 나왔습니다. 그 이유를 설
        명하고, 값만 비교할 수 있도록 코드를 수정해보세요.
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2);
        System.out.println(obj3 == obj4);
         */
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2); //-128~127사이의 값이라 자동으로 값을 비교
        System.out.println(obj3.equals(obj4)); //그 이상의 값이라 .equals를 사용하여 값 자체를 비교해줘야함

    }
}
