package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] total = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9999);
        }
        System.out.println(Arrays.toString(array));

        int sum = 0;
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 2) {
                total[i] = array[i] + array[i + 1] + array[i + 2];
                if (total[i] > sum) {
                    sum = total[i];
                    sumIndex = i;
                }
            }
        }
        System.out.println(Arrays.toString(total));
        System.out.println(sumIndex);
    }
}
