package wk9.monday;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {
        ArrayList<String> list =
                new ArrayList<>(Arrays.asList("foo","bar","taco","cat"));

        Collection<String> tree =
                new TreeSet<>(Arrays.asList("foo", "bar", "taco", "cat"));

        Iterator<String>treeIterator = tree.iterator();
        while (treeIterator.hasNext()){
            System.out.println(treeIterator.next());
        }

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        Iterator<String> listIterator = list.iterator();
        //listIterator.remove();
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }

        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        listIterator.remove();
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        listIterator.remove();
        System.out.println(list);
        //listIterator.remove();
        //System.out.println(list);
    }
}
