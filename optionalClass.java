package java8;

import javax.swing.text.html.Option;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

//Optional is a container class introduced in Java 8 used to avoid NullPointerException by representing presence
// or absence of a value safely.
//java.util.Optional
public class optionalClass {
    public static void main(String[] args) {
        System.out.println("Enter the user id: ");
        Scanner sc=new Scanner(System.in);
        int userId =sc.nextInt();
        User u=new User();
        //classic approach
//        String userName = u.getUserId(userId);
//        //null check to avoid null pointer exception
//        if(userName!=null) {
//            String msg = userName.toUpperCase() + " " + "Hello";
//            System.out.println(msg);
//        }else{
//            System.out.println("Invalid id");
        //optional class
        Optional<String> userName=u.getUserId(userId);
        userName.map(name -> name.toUpperCase() +"Hello")
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("Invalid id")
                        );
        }
    }
class User{
    Optional<String> getUserId(Integer id){
        if(id==100){
            return Optional.of("raju");
        }else if(id==101){
            return Optional.of( "rani");
        }else if(id==102){
            return Optional.of("rinki");
        }else {
            return Optional.empty();
        }
    }
}