package wk5.tuesday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SourcesExample {
    public static void main(String[] args) {
        String[] words = {"foo", "bar", "taco", "cat"};

        Arrays.stream(words).map(a -> a + "s").forEach(System.out::println);

        List<String> plurals1 =
                Arrays.stream(words).map(a -> a + "s").collect(Collectors.toList());
        plurals1.add("hello");
        List<String> plurals2 =
                Arrays.stream(words).map(a -> a + "s").toList();
        System.out.println(plurals2.get(0));
        //plurals2.add("hello");

        String msg = Arrays.stream(words).collect(Collectors.joining(","));
        System.out.println(msg);

        //int len1 = Arrays.stream(words).collect(Collectors.summarizingInt(a -> a));
        //System.out.println(len1);




    }
}
