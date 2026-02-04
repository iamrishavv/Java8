package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateAndTimeChanges {
    public static void main(String[] args) {
        LocalDate ld= LocalDate.now();//date
        System.out.println(ld);
        LocalTime lt=LocalTime.now();//time
        System.out.println(lt);
        LocalDateTime ldt=LocalDateTime.now();//date and time
        System.out.println(ldt);
        //custom date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(now.format(fmt));
        //methods
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
    }
}
