package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            System.out.println("No");
        }
        try {
            PrintWriter pw1 = new PrintWriter(file1);
            PrintWriter pw2 = new PrintWriter(file2);
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                pw1.print(random.nextInt(100) + " ");
            }
            pw1.close();
            Scanner sc = new Scanner(file1);
            String line = sc.nextLine();
            String[] numbers = line.split(" ");

            double avenge = 0;
            for (int i = 0; i <= numbers.length - 20; i += 20) {
                double sum = 0;
                for (int j = i; j < i + 20; j++) {
                    sum += Integer.parseInt(numbers[j]);
                }
                avenge = sum / 20;
                pw2.print(String.format("%.2f", avenge) + " ");
            }
            pw2.close();
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No2");
        }
        printResult(file2);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line1 = scanner.nextLine();
            String[] numbers = line1.split(" ");

            double sum = 0;
            for(String x: numbers){
                sum += Double.parseDouble(x.replace(",", "."));
            }
            System.out.println((int)sum);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("No3");
        }
    }

}
