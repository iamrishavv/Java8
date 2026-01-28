package java8;
//Java 8 allows static methods inside interfaces. These methods belong to the interface itself, not to implementing classes or objects.
//✔ Must be called using Interface name
//✔ Cannot be overridden
//✔ Cannot be accessed using object reference
//✔ Belongs to interface, not implementing class
//✔ Can have private helper methods (Java 9+)
public class staticMethod implements vehicle {
    @Override
    public void clean() {
        System.out.println("Cleaning done");
    }

    public static void main(String[] args) {
        staticMethod sm=new staticMethod();
        sm.clean();
        vehicle.start();
    }
}
interface vehicle{
    void clean();
    static void start(){
        System.out.println(" Vehicle Starting...");
    }
}
