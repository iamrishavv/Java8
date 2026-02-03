package java8;

import java.util.StringJoiner;

//StringJoiner is a utility class introduced in Java 8 used to join multiple strings with a delimiter, and optionally with prefix and suffix.
//it belongs to util.stringJoiner
public class stringJoiner {
    public static void main(String[] args) {
        //
        //StringJoiner sj = new StringJoiner(delimiter, prefix, suffix);
        StringJoiner sj1=new StringJoiner(",","{","}");
        sj1.add("Java");
        sj1.add("Python");
        sj1.add("SpringBoot");
        System.out.println(sj1);
    }
}
