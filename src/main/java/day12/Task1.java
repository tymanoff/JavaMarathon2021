package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Audi","BMW","Lada","Tesla"));
        System.out.println(list);
        list.add("Mers");
        System.out.println(list);
        list.add(3,"Seredina");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
