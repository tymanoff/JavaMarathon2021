package tinkoff;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long lesser = 2;
        long more = 4;
        int counter = 2;
        long out;
        long in = scanner.nextLong();
        if (in == 1) {
            out = 0;
        } else if (in == 2) {
            out = 1;
        } else {
            while (true) {
                if (lesser < in && in <= more) {
                    out = counter;
                    break;
                }
                counter = counter + 1;
                lesser = (long) Math.pow(2, counter - 1);
                more = (long) Math.pow(2, counter);
            }
        }
        System.out.println(out);
    }
}
