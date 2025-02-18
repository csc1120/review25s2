package wk5.tuesday;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapExamples {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        List<String> list2 = Arrays.asList("foo", "bar", "taco", "cat");

        Stream<Integer> doubled;
        doubled = list.stream().map(a -> a*2);
        doubled.forEach(System.out::println);
        //doubled.forEach(System.out::println);

        Function<String, Integer> wordToLength = a -> {
            return a.length();
        };
        list2.stream().map(a -> a.charAt(0)).forEach(System.out::println);
        list2.stream().map(wordToLength).forEach(System.out::println);

        list2.stream().map(new WordToLength());
        list2.stream().map(a->a.length());

    }
}
