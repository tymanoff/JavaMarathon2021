package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        double y = 0;

        while (x < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            x++;

            while (b!=0){
                y=a/b;
                System.out.println(y);
                break;
            }
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
        }
    }
}
