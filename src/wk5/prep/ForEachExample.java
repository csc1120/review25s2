package wk5.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachExample {
    public static void main(String[] args) {
        //collection of data like Strings
        ArrayList<String> list =
                new ArrayList<>(Arrays.asList("foo", "bar", "taco", "cat"));

        //stream of data
        Stream<String> listStream = list.stream();

        listStream.forEach(a -> System.out.println(a));

        //need to recharge the stream
        listStream = list.stream();
        listStream.forEach(ForEachExample::myPrintMethod);

        listStream = list.stream();
        listStream.forEach(System.out::println);

        Consumer<String> myPrint = ForEachExample::myPrintMethod;
        listStream = list.stream();
        listStream.forEach(myPrint);

        StringBuilder msg = new StringBuilder();

        listStream = list.stream();
        listStream.forEach(a -> msg.append(a));
        System.out.println(msg.toString());

        ArrayList<Integer> lens = new ArrayList<>();
        listStream = list.stream();
        listStream.forEach(a -> lens.add(a.length()));
        System.out.println(lens);

    }
    public static void myPrintMethod(String a){
        System.out.println(a+":");
    }
}
