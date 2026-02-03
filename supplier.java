package java8;

import java.security.SecureRandom;
import java.util.Random;
import java.util.function.Supplier;

//Supplier is a predefined functional interface in Java 8 used to supply (provide) values.
//It does NOT take any input but returns a value.
//Only One Method:
//T get();
//code to generate otp
public class supplier {
    public static void main(String[] args) {
        Supplier<String> supplier= () ->{
            StringBuilder otp=new StringBuilder(" ");
           // Random rn=new Random();
            SecureRandom srn=new SecureRandom();
            //non of digit to generate otp
            for(int i=1;i<=6;i++){
               // otp.append(rn.nextInt(10));
                otp.append(srn.nextInt(10));//if not given 1-0 iot will give decimal or negative value
            }
            return otp.toString();
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
