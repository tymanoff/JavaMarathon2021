package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File shoes = new File("src/main/resources/shoes.csv");
        File shoesMissing = new File("src/main/resources/missing_shoes.txt");


        try {
            Scanner scanner = new Scanner(shoes);
            PrintWriter pw = new PrintWriter(shoesMissing);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] kol = line.split(";");
                if (kol.length > 3) {
                    throw new IllegalArgumentException();
                } else if (Integer.parseInt(kol[2]) == 0) {
                    pw.println(line);
                    System.out.println(line);
                }
            }
            pw.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Не коректный файл");
        }


    }
}
