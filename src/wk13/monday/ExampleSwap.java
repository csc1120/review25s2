package wk13.monday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleSwap {
    public static void main(String[] args) {

        List<Integer> nums =
                new ArrayList<>(Arrays.asList(1,2,3));
        doSomething(nums);
        System.out.println(nums);
    }
    public static void doSomething(List<Integer> list){
        List<Integer> ret = new ArrayList<>(list);
        Integer a = ret.get(0);
        Integer b = ret.getLast();
        list.set(0, b);
        list.set(list.size()-1, a);
//        ret.set(0, b);
//        ret.set(ret.size()-1, a);
//        list = ret;
    }
}
