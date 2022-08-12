package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult(new File("test"));

    }
    public static void printResult(File file){
        try{
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int s = Integer.parseInt(numbers[1]);

            double sum = 0;
            for(String x: numbers){
                sum += Integer.parseInt(x);
            }
            double average = sum/ numbers.length;
            System.out.print(average + " --> " + String.format("%.3f",average));

        } catch (FileNotFoundException e){
            System.out.println("Нет файла");
        }
    }
}

