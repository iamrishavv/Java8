package java8;

import java.util.*;
import java.util.stream.Collectors;

//getting min , max and average salary of the employee
//groupBy()-top group the values.
public class q54 {
    public static void main(String[] args) {
        List<Emp1> list = Arrays.asList(new Emp1("Ram", 23, 20000), new Emp1("Rishav", 25, 60000), new Emp1("Suresh", 33, 25000), new Emp1("charan", 26, 40000));
        Double avgSalary = list.stream()
                .mapToInt(Emp1::getSalary)
                .average()
                .orElse(0);
        System.out.println("Average Salary: " + avgSalary);

        list.stream()
                .max(Comparator.comparing(Emp1::getSalary))
                .ifPresent(e -> System.out.println("Max Salary: " + e));

        list.stream()
                .min(Comparator.comparing(Emp1::getSalary))
               .ifPresent(e -> System.out.println("Min Salary: " + e));
        //group by salary using downstream
        Map<String, List<Integer>> grp = list.stream()
                .collect(Collectors.groupingBy(Emp1::getName, Collectors.mapping(Emp1::getSalary, Collectors.toList())));//downstream->you can pass another collector inside it.
        System.out.println("Grouped:"+grp);
    }
}
class Emp1 {
    String name;
    int age;
    int salary;

    Emp1(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}