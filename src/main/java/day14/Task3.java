package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File people = new File("people");
        System.out.println(parseFileToObjList(people));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> person = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");
                person.add(new Person(numbers[0],Integer.parseInt(numbers[1])));
                if (Integer.parseInt(numbers[1]) < 0) {
                    throw new IllegalArgumentException();
                }

            }
            return person;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return null;
    }
}
