package ch06;

public class Quiz20 {
    //isNumber() 메소드 작성
   static boolean isNumber(String str){
        if(str == null || str.equals(" ")){
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if('0' <= str.charAt(i) && str.charAt(i) <= '9'){
                    continue;
                } else{
                    return false;
                }
            } return true;
        }
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}


