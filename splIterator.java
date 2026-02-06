package java8;
//Spliterator is an iterator that can split elements into multiple parts to enable parallel processing.
//Spliterator (introduced in Java 8) is an interface used to:
//✔ Traverse elements
//✔ Split data into parts
//✔ Support parallel processing
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class splIterator {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Spliterator<Integer> sp1 = list.spliterator();
        Spliterator<Integer> sp2 = sp1.trySplit();

        sp1.forEachRemaining(System.out::println);
        System.out.println("----");
        sp2.forEachRemaining(System.out::println);

    }
}
