package java8;
//BiPredicate is a predefined functional interface in Java 8 used to test a condition on TWO input values and return a boolean result.
//
import java.util.function.*;
public class biPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (a, b) -> a > b;
        System.out.println(bp.test(20, 10)); // true
        System.out.println(bp.test(5, 15));  // false

    }
}
