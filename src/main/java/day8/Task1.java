package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        String s1 = " ";
        for(int i = 0; i<20000; i++){
            System.out.print(i + " ");
        }
        long stopTime1 = System.currentTimeMillis();
        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(" ");
        for(int i = 0; i<20000; i++){
            System.out.print(i + sb.toString());
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));

    }
}
