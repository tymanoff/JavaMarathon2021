package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = next(i+1);

        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("наибольший элемент массива " + max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("наименьший элемент массива " + min);

        int c = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
//        for (int element : array) {    // int(тип) i(переменная) : array(массив)
            while (array[i] % 10 == 0) {
                c++;
                sum = array[i] + sum;
                break;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на " + c);
        System.out.println("сумму элементов массива, оканчивающихся на " + sum);
    }

    public static int next(long seed) {
        int bits = 16;
        seed = (seed * 0x5DEECE66DL + 0xBL) & ((1L << 48) - 1);
        return (int) (seed >>> (48 - bits));
    }
}
