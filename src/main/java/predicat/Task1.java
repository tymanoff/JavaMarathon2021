package predicat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(List.of("Final", "One", "First", "Second"));
        List<String> str2 = new ArrayList<>(str);
        Predicate<String> pr1 = s -> s.startsWith("F");

        str.removeIf(pr1);
        System.out.println(str);
        str2.removeIf(a -> a.startsWith("O"));
        System.out.println(str2);
    }
}
