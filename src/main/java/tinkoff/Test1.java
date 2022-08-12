package tinkoff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int square = 0;
        int x = 0;
        int y = 0;
        String line = scanner.nextLine();
        String[] num = line.split(" ");
        String line2 = scanner.nextLine();
        String[] num2 = line2.split(" ");

        List<Integer> listX = new ArrayList<>();
        listX.add(Integer.parseInt(num[0]));
        listX.add(Integer.parseInt(num[2]));
        listX.add(Integer.parseInt(num2[0]));
        listX.add(Integer.parseInt(num2[2]));
        Integer maxX = Collections.max(listX);
        Integer minX = Collections.min(listX);
        x = maxX - minX;

        List<Integer> listY = new ArrayList<>();
        listY.add(Integer.parseInt(num[1]));
        listY.add(Integer.parseInt(num[3]));
        listY.add(Integer.parseInt(num2[1]));
        listY.add(Integer.parseInt(num2[3]));
        Integer maxY = Collections.max(listY);
        Integer minY = Collections.min(listY);
        y = maxY - minY;

        if (x>y){
            square = x*x;
        } else square = y*y;

        scanner.close();
        System.out.println(square);
    }
}
