package wk5.prep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<String> words = Arrays.asList("foo", "bar", "taco", "cat");

        Stream<Integer> list2 = list.stream().map(a -> a * 2);
        list2.forEach(a -> System.out.println(a));


        words.stream().map(a -> a.toUpperCase()).forEach(System.out::println);

        Stream<Integer> wordLengths = words.stream().map(a -> a.length());
    }

}
