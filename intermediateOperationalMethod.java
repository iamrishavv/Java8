package java8;
//filter method is used to get req data using given data.
//map method is used to do transform the elements and return a new stream with transformed elements.
//flatMap() is an intermediate operation used to flatten nested data structures and convert multiple streams into a single stream.
//flatMap() is used to transform and flatten nested collections into a single stream.
//slicing operations are used to select a portion (slice) of a stream instead of processing the entire data.
//They help in:✔ Pagination,✔ Limiting results,✔ Skipping records,✔ Performance optimization
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class intermediateOperationalMethod {
    public static void main(String[] args) {
        //filter
        Stream<Integer> s= Stream.of(12,14,66,56,8);
        s.filter(i -> i>=20).forEach(System.out::println);
        //map
        Stream<String> ss=Stream.of("patna","delhi","noida","bengaluru","mumbai","pune");
       // ss.map(i-> i.toUpperCase()).forEach(System.out::println);
        //ss.mapToInt(i->i.length()).forEach(System.out::println);
        System.out.println("Filtered and mapped :");
        ss.filter(i->i.startsWith("p"))
                .mapToInt(i->i.length())
                .forEach(System.out::println);
        //flatmap-->it is use to flatten the collection of collection..
        List<List<String>> list = Arrays.asList(Arrays.asList("Java", "Spring"), Arrays.asList("Docker", "AWS","Java"),Arrays.asList("SBMS","AZURE"));
        System.out.println("Flat elements:");
        list.stream()
                .flatMap(i ->i.stream())
                .forEach(System.out::println);
        //(1)slicing
        System.out.println("Unique values:");
        //(a)distinct->used to get unique elements
        List<Integer> list1 = Arrays.asList(10, 20, 10, 30, 20, 40);
        list1.stream()
                .distinct()
                .forEach(System.out::println);
        //(b)limit ->Used to restrict number of elements.it takes first n numbers
        System.out.println("after limit:");
        List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
        list2.stream()
                .limit(4)
                .forEach(System.out::println);
        //skip ->it skips first nn elements
        System.out.println("After skip:");
        List<Integer> list3 = Arrays.asList(10, 20, 30, 40, 50);
        list3.stream()
                .skip(2)
                .forEach(System.out::println);
        //limit +skip
        System.out.println("After limit and skip:");
        List<Integer> list4 = Arrays.asList(10, 20, 30, 40, 50);
        list4.stream()
                .skip(4)
                .limit(1)
                .forEach(System.out::println);
    }
}
