package java8;

import java.util.Arrays;
import java.util.List;

//forEach() is a default method introduced in Java 8 that is used to iterate over collections or streams using lambda expressions
// and method references.
//forEach() is used to process each element of a collection or stream one by one.
//collection.forEach(action);
//stream.forEach(action);
public class forEachMethod {
    public static void main(String[] args) {
        //using collections
        List<String> list = Arrays.asList("Java", "Spring", "Boot");
        list.forEach(s -> System.out.println(s));
        //using method ref
        list.forEach(System.out::println);




    }
}
