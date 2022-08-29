package Ylab;

public class Task11 {
    public static void main(String[] args) {

        long rangeBegin = 0L;
        long rangeEnd = 100L;

        long currentTime = System.currentTimeMillis();

        long randomNumber = rangeBegin + currentTime % (rangeEnd - rangeBegin);

        System.out.println(randomNumber);
    }


}
