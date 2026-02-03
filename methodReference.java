package java8;
//Method Reference is a shortcut syntax of Lambda Expression used to call existing methods in a cleaner way.
//It uses the :: operator (double colon).
//✅ Syntax
//ClassName::methodName
//object::methodName
import java.util.List;
import java.util.Arrays;

public class methodReference {
    public static void main(String[] args) {
        //using lambda
        List<String> list = Arrays.asList("Java", "Spring", "Boot");
        list.forEach(s -> System.out.println(s));;
        //using method ref
        List<String> list2 = Arrays.asList("Java", "Spring", "Boot");
        list2.forEach(System.out::println);


    }
}
