package java8;

import java.util.function.BiFunction;

//BiFunction is a predefined functional interface in Java 8 used to take TWO inputs and return ONE output.
//
public class biFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bf = (a, b) -> a + b;
        System.out.println(bf.apply(10, 20)); // 30

    }
}
