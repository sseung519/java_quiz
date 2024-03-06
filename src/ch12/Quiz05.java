package ch12;

public class Quiz05 {
    public static void main(String[] args) {
        String str = "";
        StringBuilder strs = new StringBuilder();
        for (int i = 0; i <= 100 ; i++) {
           strs.append(i);
        }
        str = strs.toString();
        System.out.println(str);
                
    }
}
