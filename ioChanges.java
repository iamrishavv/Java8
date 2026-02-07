package java8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ioChanges {
    public static void main(String[] args) throws IOException {
        //old style
//        FileReader fr=new FileReader(new File("f1.txt"));
//        BufferedReader br=new BufferedReader(fr);
//        String s = br.readLine();
//        while(s!=null){
//            System.out.println(s);
//            s= br.readLine();
//        }
//        br.close();
        //modern way Using try-with-resources + Stream
        try (Stream<String> stringStream = Files.lines(Path.of("f1.txt"))) {
            stringStream.forEach(System.out::println);
        }
        //another using buffer reader
        try (BufferedReader br =
                     new BufferedReader(new FileReader("f1.txt"))) {

            br.lines().forEach(System.out::println);
        }
    }
}
