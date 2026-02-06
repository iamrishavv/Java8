package java8;

import java.util.Arrays;
import java.util.List;

//A parallel stream allows you to process stream elements concurrently using multiple CPU cores.
//Instead of one thread working sequentially, Java splits the data and processes it in multiple threads.
//A parallel stream is a stream that executes operations in parallel using the ForkJoin common pool.
public class parallelStream {
    public static void main(String[] args) {
        //creating a parallel stream
        List<Integer>l= Arrays.asList(1,2,3,4);
        l.parallelStream()
                .forEach(i-> System.out.println(Thread.currentThread().getName()+"->" +i));
        //converting a sequential to parallel
        l.stream()
                .parallel()
                .forEach(System.out::println);
        //converting back to seq
        l.parallelStream()
                .sequential()
                .forEach(System.out::println);
    }
}
