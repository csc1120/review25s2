package wk9.monday;

import java.util.Iterator;

public class IteratorTester {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("foo");
        list.add("bar");
        list.add("taco");

        Iterator<String> myIterator = list.iterator();
//        while(myIterator.hasNext()){
//            System.out.println(myIterator.next());
//        }
        System.out.println(myIterator.next());
        myIterator.remove();
        System.out.println(myIterator.next());
//        System.out.println(myIterator.next());
////        myIterator.remove();
//        System.out.println(list);
    }
}
