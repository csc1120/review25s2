package wk5.prep;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExamples {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        list1.stream().forEach(a -> System.out.println(a));

        Optional<Integer> ans = list1.stream().reduce((a,b) -> a+b);
        if(ans.isPresent()){
            System.out.println(ans.get());
        }
        List<Integer> list2 = Arrays.asList(3,4,1,5,5,6);
        System.out.println(list2.stream().reduce((a,b) -> Math.max(a,b)).get());

        list2.stream().max(Integer::compare);
        list2.stream().max((a,b) -> (a-b));



    }
}
