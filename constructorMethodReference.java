package java8;

import javax.print.Doc;
import java.util.function.Supplier;

//ClassName::new
public class constructorMethodReference {
    public static void main(String[] args) {
       // constructorMethodReference cmr=new constructorMethodReference();
         Supplier<Doctor> s=Doctor::new;
        System.out.println(s.get().hashCode()
        );
    }
}
class Doctor{
    Doctor(){
        System.out.println("Doctor");
    }
}