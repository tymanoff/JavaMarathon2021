package Ylab.Task1;

import java.util.function.DoubleUnaryOperator;

public class Task18 {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double result = 0;
        int n = 1000000;
        double h = (b-a) /n;
        for (int i = 0; i < n; i++) {
            result += f.applyAsDouble(a+h*(i+0.5));
        }
        result *= h;
        return result;
    }
}
