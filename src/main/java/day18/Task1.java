package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] mass, int i) {
        if (i == mass.length) {
            return 0;
        } else {
            return mass[i] + recursionSum(mass, i + 1);
        }
    }
}