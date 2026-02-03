package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
//and() ->Used to combine two conditions (Logical AND)
//or() ->Used for Logical OR
//negate() -> used to reverse the condition
public class predicateJoiningMethod {

    public static void main(String[] args) {
        Employee e1=new Employee("raju","Bangalore","IT");
        Employee e2=new Employee("ritik","Hyderabad","Non-It");
        Employee e3=new Employee("samu","Pune","Hr");
        Employee e4=new Employee("emliy","Gurugram","TechLead");
        Employee e5=new Employee("rishu","Bangalore","Devops");
        List<Employee> list = Arrays.asList(e1, e2, e3, e4,e5);
        Predicate<Employee> p1= e ->e.location.equals("delhi");
        Predicate<Employee> p2= e ->e.dep.equals("IT");
        //join predicate using and
        Predicate<Employee> j1 = p1.and(p2);
        for(Employee e:list){
            if(j1.test(e)){
                System.out.println(e.name);
            }
        }
        //join predicate using or
        Predicate<Employee> j2 = p1.or(p2);
        for(Employee e:list){
            if(j2.test(e)){
                System.out.println(e.name);
            }
        }
        //using negate-> reverse the condition
        Predicate<Employee> j3 = p1.negate();
        for(Employee e:list){
            if(j3.test(e)){
                System.out.println(e.name);
            }
        }
    }
}
class Employee{
    String name;
    String location;
    String dep;
    Employee(String name,String location, String dep){
        this.name=name;
        this.location=location;
        this.dep=dep;
    }
}