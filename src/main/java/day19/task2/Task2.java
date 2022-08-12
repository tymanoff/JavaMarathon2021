package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/taxi_cars.txt");
        Map<Integer, Point> counterMap = new HashMap<>();

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                counterMap.put(Integer.parseInt(words[0]), new Point(Integer.parseInt(words[1]), Integer.parseInt(words[2])));

            }

        } catch (FileNotFoundException e) {
            System.out.println("No");
        }
        Scanner scannerIn = new Scanner(System.in);
        int x1 = scannerIn.nextInt();
        int y1 = scannerIn.nextInt();
        int x2 = scannerIn.nextInt();
        int y2 = scannerIn.nextInt();
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        int totalCars = 0;
        for(Map.Entry<Integer, Point> entry : counterMap.entrySet()){
            Point thePoint = entry.getValue();
            if(thePoint.getX() > point1.getX() && thePoint.getX() < point2.getX()){
                if(thePoint.getY() > point1.getY() && thePoint.getY() < point2.getY()){
                    System.out.println(entry.getKey());
                    totalCars++;
                }
            }
        }
        System.out.println("Total: " + totalCars);
    }
}

