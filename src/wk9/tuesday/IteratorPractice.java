package wk9.tuesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        ArrayList<String> list =
                new ArrayList<>(Arrays.asList("foo", "bar", "taco", "cat", "hello", "world"));

        Iterator<String> listIterator = list.iterator();

        listIterator.next();
        listIterator.next();
        listIterator.remove();
        listIterator.next();
        listIterator.remove();
        listIterator.next();

        System.out.println(list);
//
//        while(listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
//        listIterator.remove();
//        listIterator.next();
//        listIterator.remove();
//        System.out.println(list);



    }
}
