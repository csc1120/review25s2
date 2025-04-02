package wk10.tuesday;

import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        list.add("foo");
        list.add("bar");
        list.add("taco");
        list.add("cat");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }




    }
}
