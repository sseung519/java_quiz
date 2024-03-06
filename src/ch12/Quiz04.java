package ch12;

public class Quiz04 {
    public static void main(String[] args) {
        /*
        4. 다음 바이트 배열은 UTF-8 문자셋으로 인코딩한 데이터로, 다시 문자열로 디코딩해서 변수 data
에 저장하려고 합니다. 물음표에 들어갈 코드를 작성해보세요.
         */
        byte[] bytes = {-20, -107, -120, -21, -123, -107};
        String str = new String(bytes);
        System.out.println("str: " + str);
    }
}
