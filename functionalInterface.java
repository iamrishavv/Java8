package java8;
//A Functional Interface is an interface that contains exactly ONE abstract method. It is the backbone of Lambda Expressions in Java 8.
//👉 Java 8 introduced this to support functional programming.
public class functionalInterface implements run{
    @Override
    public void sum(int a,int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        functionalInterface f=new functionalInterface();
        f.sum(12,13);
    }
}
//without lambdas
@FunctionalInterface
interface run{
    void sum(int a,int b);
}