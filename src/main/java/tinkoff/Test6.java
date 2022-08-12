package tinkoff;

import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int[][] intervals = new int[number][2];
        while (count<number){
            String line = scanner.nextLine();
            String[] num = line.split(" ");
            intervals[count][0] = Integer.parseInt(num[0]);
            intervals[count][1] = Integer.parseInt(num[1]);
            count++;
        }

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> optimalSchedule = schedule(intervals);

        System.out.println(optimalSchedule.size());
    }

    private static List<int[]> schedule(int[][] intervals) {

        ArrayList<int[]> optimalIntervalSet = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));

        int lastFinishTime = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            int start = interval[0];
            if (start >= lastFinishTime) {
                int end = interval[1];

                optimalIntervalSet.add(interval);

                lastFinishTime = end;
            }
        }

        return optimalIntervalSet;
    }
}
