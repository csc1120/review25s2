package wk7.tuesday;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListDriver {
    public static void main(String[] args) {
        List<String> words1 = new ArrayList<>();
        List<Integer> nums1 = new ArrayList<>();

        MyArrayList<String> words = new MyArrayList<>();
        System.out.println("Size at begininng "+words.size());
        words.add("foo");
        words.add("bar");
        System.out.println("Size at after "+words.size());
        System.out.println(words);

        words.add("taco");
        words.add("cat");
        words.add("hello");
        words.add("world");
        words.add("how");
        words.add("are");

        System.out.println(words);
        words.remove(0);
        System.out.println(words);

        words.remove(words.size()-1);
        System.out.println(words);

        words.remove(words.size()/2);
        System.out.println(words);

        //words.remove(-1);
        System.out.println(words.size());
        //words.remove(words.size());
        System.out.println(words);
        System.out.println(words.size());

        System.out.println("Word before");
        System.out.println(words);
        words.add(0, "insert1");
        System.out.println(words);
        words.add(words.size(), "insert2");
        System.out.println(words);
        words.add(words.size()/2, "insert3");
        System.out.println(words);




    }
}
