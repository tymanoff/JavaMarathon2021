package Ylab;

import java.math.BigInteger;

public class Task15 {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(3));
    }
    public static BigInteger factorial(int value) {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= value; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }
}
