package day14;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("people");

        System.out.println(parseFileToStringList(file1));
    }

    public static List<String> parseFileToStringList(File file) {

        List<String> strings = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                strings.add(line);
                String[] numbers = line.split(" ");

                if (Integer.parseInt(numbers[1]) < 0) {
                    throw new IllegalArgumentException();
                }
            }
            return strings;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
