package java8;

import java.util.function.Function;

//Function is a predefined functional interface in Java 8 used to transform one input into one output.
//it can return any type of input but predicate return only boolean
//Only One Method:
//R apply(T t);
// in function Functional interface we define one input and one output
public class function {
    public static void main(String[] args) {
        //here string is input type and integer is output type
        Function<String,Integer> f=s ->s.length();
        System.out.println(f.apply("java"));
        System.out.println(f.apply("SpringBoot"));
    }
}
