package java8;

import java.util.function.Function;

//syntax
//ClassName::staticMethod
public class staticMethodReference {
    public static int square(int n) {
        return n * n;
    }
    public static void main(String[] args) {
        Function<Integer, Integer> square = staticMethodReference::square;
        System.out.println(square.apply(5));

    }
}
