package java8;
//BiConsumer is a predefined functional interface in Java 8 used to consume TWO input values and perform an action.
//It does NOT return anything.
//Only One Method:
//void accept(T t, U u);
import java.util.function.*;
public class biConsumer {
    public static void main(String[] args) {
        BiConsumer<String, String> bc = (name, city) -> System.out.println(name + " from " + city);
        bc.accept("Rishav", "Bengaluru");

    }
}
