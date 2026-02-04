package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//The Stream API  is used to process collections of data in a functional and declarative way using lambda expressions.
//Stream API is used to process collections by performing operations like filtering, mapping, and reducing in a functional style.
public class stream {
    public static void main(String[] args) {
        //(A)create a stream using collections
        List<String> list = Arrays.asList("Java", "Spring", "Boot");
        list.stream()
                .forEach(System.out::println);

        //(B)using arrays
        int  [] arr={1,2,2,3,4,6};
        Arrays.stream(arr)
               .forEach(System.out::println);
        //(C) using stream.of()
        Stream<Integer> stream =Stream.of(1,2,3,4);
        stream.forEach(System.out::println);
        //(D) using generate for infinite stream
        Stream.generate(() -> "Java")
                .limit(3)
                .forEach(System.out::println);
        //(E)using
    }
}
