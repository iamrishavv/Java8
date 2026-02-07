package java8;
//(1)how many male and female are in the organisation.
//(2)print the name of departments in the organisation
//(3)what is the average age of male and female employees
//(4)Get the details of highest paid employee in the org.
//(5)Get the name of all emp who joined after 2015
//(6)count the no of emp in each department
//(7)what is the average salary of each dep
//(8)get the details of youngest emp working in it dep.
//(9)who is most experienced person in the organisation.
//(10)how many male and female in sales and marketing dep.
//(11) what is the average salary of male and female emp.
//(12)list down the names of all emp in each dep
//(13)what is the average and total salary of whole org.
//(14)separate the emp who is younger or equal to 25 year from the emp who is older than 25 years
//(15)who is the oldest emp in the org .wht is his age and dep he belongs to
//(16)2nd and 3rd highest salary
import java.util.*;
import java.util.stream.Collectors;

public class q55 {
    public static void main(String[] args) {
        List<Emp2> employees = Arrays.asList(
                new Emp2(1,"Ravi",25,"Male","IT",50000,2020),
                new Emp2(2,"Sneha",28,"Female","HR",45000,2019),
                new Emp2(3,"Amit",35,"Male","Finance",70000,2016),
                new Emp2(4,"Priya",30,"Female","IT",65000,2018),
                new Emp2(5,"Karan",27,"Male","Sales",48000,2021),
                new Emp2(6,"Neha",32,"Female","Marketing",62000,2017),
                new Emp2(7,"Arjun",29,"Male","IT",58000,2019),
                new Emp2(8,"Pooja",26,"Female","HR",42000,2022),
                new Emp2(9,"Vikas",40,"Male","Management",90000,2014),
                new Emp2(10,"Meera",31,"Female","Finance",75000,2016),
                new Emp2(11,"Rohit",24,"Male","Support",38000,2023),
                new Emp2(12,"Anjali",29,"Female","IT",61000,2020),
                new Emp2(13,"Manish",36,"Male","Finance",82000,2015),
                new Emp2(14,"Kavya",27,"Female","Marketing",54000,2021),
                new Emp2(15,"Deepak",33,"Male","Sales",47000,2018),
                new Emp2(16,"Shreya",28,"Female","Management",88000,2017)
        );
        //(1) using grouping and downstream collector .
        Map<String, Long> collect = employees.stream()
                .collect(Collectors.groupingBy(Emp2::getGender, Collectors.counting()));
        System.out.println(collect);
        //(2)and (6) using grouping and downstream collector .
        Map<String, Long> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Emp2::getDepartment, Collectors.counting()));
        System.out.println(collect1);
        //(3)using grouping and downstream collector and averagingInt.
        Map<String, Double> collect2 = employees.stream()
                .collect(Collectors.groupingBy(Emp2::getGender, Collectors.averagingInt(Emp2::getAge)));
        System.out.println(collect2);
        //(4)using stream.max/also done using collectors
        Optional<Emp2> max = employees.stream()
                .max(Comparator.comparing(Emp2::getSalary));
        max.ifPresent(System.out::println);
        //(5)
        List<String> collect3 = employees.stream()
                .filter(i -> i.getYearOfJoining() > 2015)
                .map(Emp2::getName)
                .collect(Collectors.toList());
        System.out.println(collect3);
        //(7)
        Map<String, Double> collect4 = employees.stream()
                .collect(Collectors.groupingBy(Emp2::getDepartment, Collectors.averagingDouble(Emp2::getSalary)));
        System.out.println(collect4);
        //(8)
        Optional<Emp2> min = employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
                .min(Comparator.comparing(Emp2::getAge));
        System.out.println(min);
        //(9)
        Optional<Emp2> min1 = employees.stream()
                .min(Comparator.comparing(Emp2::getYearOfJoining));
        System.out.println(min1);
        //(10)
        Map<String, Long> sales = employees.stream()
                .filter(i -> i.getDepartment().equalsIgnoreCase("sales")||i.getDepartment().equalsIgnoreCase("Marketing"))
                .collect(Collectors.groupingBy(Emp2::getGender, Collectors.counting()));
        System.out.println(sales);
        //(11)
        Map<String, Double> collect5 = employees.stream()
                .collect(Collectors.groupingBy(Emp2::getGender, Collectors.averagingDouble(Emp2::getSalary)));
        System.out.println(collect5);
        //(12)
        Map<String, List<String>> collect6 = employees.stream()
                .collect(Collectors.groupingBy(Emp2::getDepartment, Collectors.mapping(Emp2::getName, Collectors.toList())));
        System.out.println(collect6);
        //(13)
        DoubleSummaryStatistics collect7 = employees.stream()
                .collect(Collectors.summarizingDouble(Emp2::getSalary));
        System.out.println(collect7.getAverage());
        System.out.println(collect7.getMax());
        //(14)
        Map<Boolean, List<Emp2>> collect8 = employees.stream()
                .collect(Collectors.partitioningBy(i -> i.getAge() <= 25));
        System.out.println(collect8);
        //(15)
        Optional<Emp2> min2 = employees.stream()
                .max(Comparator.comparing(Emp2::getAge));
        min2.ifPresent(i-> {
            System.out.println("Name       : " + i.getName());
            System.out.println("Age        : " + i.getAge());
            System.out.println("Department : " + i.getDepartment());
        });
        //(16)
        List<Emp2> collect9 = employees.stream()
                .sorted(Comparator.comparing(Emp2::getSalary).reversed())
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(collect9);
        //(17)
        
    }
}
class Emp2{
    int id;
    String name;
    int age;
    String gender;
    String department;
    double salary;
    int yearOfJoining;
    Emp2(int id, String name, int age, String gender,
         String department, double salary, int yearOfJoining) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public int getYearOfJoining() { return yearOfJoining; }
    public void setYearOfJoining(int yearOfJoining) { this.yearOfJoining = yearOfJoining; }
    // ✅ toString (Helpful for printing)
    @Override
    public String toString() {
        return "Emp2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }

}