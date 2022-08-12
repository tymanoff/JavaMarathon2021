package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 >= number2) {
            System.out.println("Некорректный ввод");
        } else for (int i = number1 + 1; i < number2; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}
