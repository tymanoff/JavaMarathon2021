package day19;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dushi.txt");

        try (Scanner scanner = new Scanner(file)) {
            Map<String, Integer> counterMap = new HashMap<>();
            ValueComparator bvc = new ValueComparator(counterMap);
            TreeMap<String, Integer> treeMap = new TreeMap<>(bvc);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("[.,:;()?!\"\\s–]+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        Integer count = counterMap.get(word);
                        if (count == null) {
                            count = 0;
                        }
                        counterMap.put(word, ++count);
                    }
                }
            }
            treeMap.putAll(counterMap);
            int count = 0;
            for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
                if (count > 99){
                    break;
                }
                System.out.println(entry.getKey() + " : " + entry.getValue());
                    count++;
            }

            System.out.println("// Чичиков - " + counterMap.get("Чичиков"));
        } catch (FileNotFoundException e) {
            System.out.println("No");
        }
    }
}

class ValueComparator implements Comparator<String> {

    Map<String, Integer> base;

    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }
}
