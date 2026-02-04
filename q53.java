package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//get name and age whose salary is greater than 50k
public class q53 {
    public static void main(String[] args) {
        Emp e1 = new Emp("Raju", 25, 60000);
        Emp e2 = new Emp("Rani", 22, 45000);
        Emp e3 = new Emp("Amit", 30, 70000);
        Emp e4 = new Emp("John", 28, 40000);
        List<Emp> l=  Arrays.asList(e1,e2,e3,e4);

        l.stream()
                .filter(i-> i.salary>50000)
                .map(i ->"name:"+i.name+ "\n"+"age:"+ i.age)
                .forEach(System.out::println);

    }
}
class Emp{
    int age;
    String name;
    int salary;
    Emp(String name,int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}