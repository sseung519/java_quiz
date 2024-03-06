package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz09 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        String strNow = sdf.format(now);
        System.out.println(strNow);

    }
}
