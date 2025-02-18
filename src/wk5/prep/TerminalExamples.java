package wk5.prep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalExamples {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("foo", "bar", "taco", "cat");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        String[] bigWords = words.
                stream().map(a -> a.toUpperCase()).toArray(String[]::new);
        for(String s:bigWords){
            System.out.println(s);
        }
        System.out.println(words.stream().count());

        List<Integer> nums1 =
                list.stream().map(a -> a * 2).collect(Collectors.toList());
        nums1.add(42);
        List<Integer> nums2 =
                list.stream().map(a -> a * 2).toList();
        //can't modify
        //nums2.add(42);



    }
}
