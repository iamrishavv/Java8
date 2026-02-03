package java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
//Predicate is a predefined functional interface in Java 8 used for condition checking. It takes one input and returns a boolean value.
//it belongs to java.util.function.predicate.
//Predicate represents a function that tests a condition and returns true or false.
//it has only one abstract method
//boolean test(T t);
public class predicate {
    public static void main(String[] args) {
        //integer
        Predicate<Integer> pi= n -> n > 10;
        System.out.println(pi.test(18));
        System.out.println(pi.test(2));
        //string
        Predicate<String > ps=n -> n.startsWith("j");
        System.out.println(ps.test("java"));
        System.out.println(ps.test("string"));
        //collections for filtering
        List<Integer> l= Arrays.asList(5,10,11,12);
        l.stream()
                .filter(n -> n>=10)
                .forEach(System.out::println);
    }
}
