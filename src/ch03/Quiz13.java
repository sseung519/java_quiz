package ch03;

public class Quiz13 {
    public static void main(String[] args) {
        char ch = 'b';
        char lowerCase = (char) ((65 <= ch) && (ch <= 90) ? ch + 32 : ch);
        //char lowerCase = (char) (('A' <= ch) && (ch <= 'Z') ? (char)(ch + 32) : ch);

        System.out.println("ch:" + ch);
        System.out.println("ch to lowerCase:" + lowerCase);

    }
}
