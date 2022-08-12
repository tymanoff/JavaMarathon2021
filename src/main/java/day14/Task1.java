package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file1 = new File("test");
        printSumDigits(file1);

    }
    public static void printSumDigits(File file){

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if(numbers.length != 10){
                System.out.println("Некорректный входной файл");
            }else {
                int sum = 0;
                for (String x: numbers)
                    sum = sum + Integer.parseInt(x);

                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
