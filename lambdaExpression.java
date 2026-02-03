package java8;
//A Lambda Expression is a short and clean way to write anonymous functions. It is mainly used to implement Functional Interfaces.
//👉 Introduced in Java 8 to support functional programming.
public class lambdaExpression {
    public static void main(String[] args) {
        Test t = () -> {
            System.out.println("Hi");
        };
        t.display();
        t.test();
        Test.display2();
        //with param
        Add add= (a,b) -> a+b;
        System.out.println(add.sum(10,12));

    }
}
//without param
@FunctionalInterface
interface Test {
    void display();
    default void test() {
        System.out.println("Default Method");
    }

    static void display2() {
        System.out.println("Static Method");
    }
}
//with param
interface Add {
    int sum(int a, int b);
}