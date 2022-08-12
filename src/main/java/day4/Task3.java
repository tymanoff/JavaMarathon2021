package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[8][12];
        int[] total = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                array[i][y] = (int) (Math.random() * 3);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                total[i] += array[i][y];
            }
        }
        System.out.println(Arrays.toString(total));

        int max = total[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (total[i] > max) {
                max = total[i];
                maxIndex = i;
            }
        }
        System.out.println("индекс строки, сумма чисел в которой максимальна " + maxIndex);
    }
}
