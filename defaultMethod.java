package java8;
//A default method is a method with implementation inside an interface.
// It was introduced in Java 8 to support backward compatibility and multiple inheritance of behavior.
//default method can be overridden so static method was introduced.
//Before Java 8:
//Adding a new method to an interface breaks all implementing classes.
//With default method:
//You can add new methods without affecting old implementations.
//👉 This is called Backward Compatibility.
public class defaultMethod implements Car{
    @Override
    public void clean() {
        System.out.println("Cleaning Done");
    }
//we can override default method also if we do not want parent class implementation
    @Override
    public void starting() {
        System.out.println("My car starting..");
    }

    public static void main(String[] args) {
        defaultMethod dm=new defaultMethod();
        dm.clean();
        dm.starting();
    }
}
interface Car{
    void clean();
    default void starting(){
        System.out.println("Car Starting...");
    }
}
