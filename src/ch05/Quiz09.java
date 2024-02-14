package ch05;

public class Quiz09 {
    public static void main(String[] args) {

        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        int student = 0;
        for (int i = 0; i < array.length; i++) {
            student += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
       double avg = (double) sum / student;
        System.out.println("전체 합:" + sum + "평균: " + avg);


    }
}
