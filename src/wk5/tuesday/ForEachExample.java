package wk5.tuesday;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("foo", "bar", "taco","cat");

        Stream<String> listStream = list.stream();
        listStream.forEach(a -> System.out.printf("%20s",a));

        listStream = list.stream();
        listStream.forEach(ForEachExample::myPrintMethod);

        Consumer<String> myPrintConsumer = a -> System.out.println(a);

        listStream = list.stream();
        listStream.forEach(myPrintConsumer);
    }
    public static void myPrintMethod(String word){
        System.out.println(word.toUpperCase());
    }
}
