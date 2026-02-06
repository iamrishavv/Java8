package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Terminal operations are the final operations in a stream pipeline.
//They trigger the execution of the stream and produce a result or sideEffect.
//Terminal operations consume the stream and produce a result or perform an action
//collect() is a terminal operation used to convert Stream into Collection or Map.
public class terminalOperationMethod {
    public static void main(String[] args) {
        //(A)foreach()->Perform action
        System.out.println("Using foreach:");
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        list1.forEach(System.out::println);
        //(B)count()-> count elements
        System.out.println("using count:");
        List<Integer> list2 = Arrays.asList(10, 20, 30, 40);
        long count = list2.stream()
                .count();
        System.out.println(count);
        //(C)reduce->used to combine all elements
        System.out.println("Using reduce:");
        List<Integer> list3 = Arrays.asList(10, 20, 30);
        //List<String> list3=Arrays.asList("java","full","stack");
        int reduce = list3.stream()
               .reduce(0,(a, b) -> a + b);//o for int and "" for string is called identity It is a value that, when combind with another element, doesn't change that element.
                      // .reduce("",(a,b)->a+b);
        System.out.println(reduce);
        //(D)findFirst->give first number
        System.out.println("After findFirst:");
        List<String> list4 = Arrays.asList("Java", "Spring", "Boot");
        Optional<String> findf = list4.stream()
                .findFirst();
        System.out.println(findf.get());
        //(E)findAny->get any element
        System.out.println("After findAny:");
        List<String> list5 = Arrays.asList("A", "B", "C");
        Optional<String> find = list5.stream()
                .findAny();
        System.out.println(find.get());
        //(F)anyMatch()->Check ANY element matches condition::
        System.out.println("After anyMatch:");
        List<Integer> list6 = Arrays.asList(10, 20, 30);
        boolean any = list6.stream()
                .anyMatch(n -> n > 10);//true
        System.out.println(any);
        //(G)allMatch()->Check ALL elements match condition.
        System.out.println("after allMatch:");
        List<Integer> list7= Arrays.asList(10, 20, 30);
        boolean all = list7.stream()
                .allMatch(i -> i > 20);//false because all does not satisfy the condition
        System.out.println(all);
        //(H)noneMatch() ->Check NO element matches condition.
        System.out.println("After noneMatch:");
        List<Integer> list8 = Arrays.asList(10, 20, 30);
        boolean none = list8.stream()
                .noneMatch(i -> i <0);//true because none of them satisfy the condition
        System.out.println(none);
        //(I)min and max->
        System.out.println("After min nd max:");
        List<Integer> list9 = Arrays.asList(10, 5, 20);
        Optional<Integer> min = list9.stream()
                        .min(Integer::compareTo);
                         // .max(Integer::compareTo);
        System.out.println(min.get());
        //(J)collectors
        System.out.println("After collectors:");
        List<Integer> list10 = Arrays.asList(10, 20, 30);
        List<Integer> integerStream = list10.stream()
                .filter(i -> i > 10)
                .collect(Collectors.toList());
        System.out.println(integerStream);
        List<Integer> list11=Arrays.asList(10,20,30,10);
        Set<Integer> collect = list11.stream()
                .collect(Collectors.toSet());//remove duplicate
        System.out.println(collect);
        List<String> list12 = Arrays.asList("Java", "Spring", "Boot");
        Map<String, Integer> map = list12.stream()
                .collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(map);

    }
}
