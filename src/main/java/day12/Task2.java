package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(createList(0,30));
        System.out.println(createList(300,350));


    }
    public static List<Integer> createList(int min, int max){
        List<Integer> list = new ArrayList<>();
        for (int i = min; i<max; i++){
            if (i%2==0){
                list.add(i);
            }
        }
        return list;
    }
}
