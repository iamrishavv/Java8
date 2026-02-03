package java8;
//Consumer is a predefined functional interface in Java 8 used to consume data (perform action).
//It takes input but does NOT return anything.
//Only One Method:
//void accept(T t);
//foreach() and andThen() are default consumer method.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class consumer {
    public static void main(String[] args) {
        Consumer<String> c = name -> System.out.println( "Hello"+" " +name);
        c.accept("rishav");
        List<Integer> l= Arrays.asList(10,11,12,13);
        //forEach() uses Consumer internally
        l.forEach(i -> System.out.println(i));
        //Used to chain multiple Consumers
        Consumer<String> c1 = s -> System.out.println("Hello " + s);
        Consumer<String> c2 = s -> System.out.println("Welcome " + s);
        Consumer<String> result = c2.andThen(c1);
        result.accept("Java");


    }
}
