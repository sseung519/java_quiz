package ch05;

public class Quiz06 {
    public static void main(String[] args) {
        //예상
        // array.length= 3 (배열 안의 배열3개)
        // array[2].length= 5 (배열 안의 3번째 배열의 길이)
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };

        System.out.println(array.length);
        System.out.println(array[2].length);

    }
}
