package java8;
//object::methodName
public class instanceMethodReference {
    public void m1(){
        for(int i=1;i<5;i++){
            System.out.println("Child Thread");
        }
    }
    public static void main(String[] args) {
        instanceMethodReference ism=new instanceMethodReference();
        Runnable r = ism::m1;
        r.run();
        Thread t1=new Thread(r);
        t1.start();
        for(int i=1;i<5;i++){
            System.out.println("Parent Thread");
        }
    }
}
