package tinkoff;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());
        int count = 0;
        ArrayList<String[]> teamsList = new ArrayList<>();
        while (count<year){
            String line = scanner.nextLine();
            String[] team = line.split(" ");
            Arrays.sort(team);
            teamsList.add(team);
            count++;
        }

        HashSet<Integer> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < teamsList.size(); i++) {
            for (int j = i; j < teamsList.size(); j++) {
                if(Arrays.equals(teamsList.get(i), teamsList.get(j)) && i!=j){
                    if(!set.contains(j)) {
                        if (!map.containsKey(Arrays.toString(teamsList.get(i)))){
                            map.put(Arrays.toString(teamsList.get(i)), 2);
                        }else {
                            map.put(Arrays.toString(teamsList.get(i)), map.get(Arrays.toString(teamsList.get(i))) + 1);
                            set.add(j);
                        }
                    }
                }
            }
        }
        Integer max = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
        System.out.println(max);
    }
}
