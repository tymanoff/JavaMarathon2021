package day3;

import com.sun.glass.events.WheelEvent;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double i;

            if (y != 0){
                i = x/y;
                System.out.println(i);
            } else
                break;
        }

    }
}
