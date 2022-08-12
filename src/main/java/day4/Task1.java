package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] array = new int[a];
        int q = 0;
        int w = 0;
        int c = 0;
        int r = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.ceil((Math.random() * 9));
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);

        for (int x : array) {
            while (x > 8) {
                q++;
                break;
            }
            while (x == 1) {
                w++;
                break;
            }
            while (x % 2 == 0) {
                c++;
                break;
            }
            while (x % 2 != 0) {
                r++;
                break;
            }
        }
        System.out.println("Количество чисел больше 8: " + q);
        System.out.println("Количество чисел равных 1: " + w);
        System.out.println("Количество четных чисел: " + c);
        System.out.println("Количество нечетных чисел: : " + r);

        int sum = 0;
        for (int x : array) {
            sum = sum + x;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
