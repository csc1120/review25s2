package wk6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RuntimeWithListExample {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        int n = 1000;
        for(int i = 0; i<n; i++){
            list.add(random.nextInt(0,10));
        }
        printList1(list);
        printList2(list);
        printList3(list);
    }

    public static void printList1(List<Integer> list){
        final int toPrint = 5;
        for(int i = 0; i < toPrint; i++){
            System.out.println(list.get(i));
        }
    }
    public static void printList2(List<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void printList3(List<Integer> list){
        for(int i = 0; i<list.size(); i++){
            for(int j = 0; j<list.size(); j++){
                System.out.println(list.get(i) + list.get(j)+" ");
            }
        }
    }
    public static void printList4(List<Integer> list){
        for(int i = 0; i<list.size(); i *= 2){
            System.out.println(list.get(i));
        }
    }
}
