package Ylab;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
    }
    public static boolean isPowerOfTwo(int value) {
        return Integer.toBinaryString(Math.abs(value)).replace("0", "").length() == 1;
    }
}
