package day0;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(42);
        l.add(null);
        for (int i = 0; i < l.size(); i++) System.out.println(l.get(i));
        for (Object i : l) System.out.println(i);
//        for (int i : l) System.out.println(i);
        String str = new String("yee");
        str.replace("yee","iii");

        int[][] arr2D = new int[][] {{0,1},{9,8}};



    }

}