package wk9.tuesday;

import java.util.Iterator;

public class MyArrayIteratorTester {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("taco");
        list.add("cat");

        Iterator<String> listIterator = list.iterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        listIterator.remove();
        listIterator.remove();
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());

        System.out.println(list);
    }
}
