package codingTest;

public class Test {
    public static void main(String[] args) {
        String myString = "aBcDeFg";
        String answer = "";
        for(int i=0; i< myString.length(); i++){
            if('A'<= myString.charAt(i) && myString.charAt(i) <='Z'){
                answer= String.valueOf(myString.charAt(i) + 32);
            } else {
                answer=myString;
            }
        }
        System.out.println(answer);;
    }
}
