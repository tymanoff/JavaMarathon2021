package Ylab;

public class Task12 {
    private final static int MULTIPLIER_A = 11035;
    private final static int INCREMENT_C = 123;
    private final static int MODULUS = 214; // max int

    private static int seed = 3819;

    public static int randomInt() {
        seed = (seed * MULTIPLIER_A + INCREMENT_C) % MODULUS;
        return seed;
    }

    public static int randomPositiveInt() {
        int tmp = randomInt();
        if (tmp < 0) {
            seed = tmp * -1;
        }
        return seed;
    }

    public static void main(String[] args) {
        System.out.println(randomPositiveInt()); // 1801118106
        System.out.println(randomPositiveInt()); // 41211189
        System.out.println(randomPositiveInt()); // 11738570

        for (int i = 0; i < 7; i++) {
            System.out.println(randomPositiveInt());
        }
    }
}
