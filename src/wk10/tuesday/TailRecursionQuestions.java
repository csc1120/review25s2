package wk10.tuesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TailRecursionQuestions {

    /**
     * Wrapper method for min
     * Find and return the minimum value in the array.
     * @param nums array of ints. You can assume the array
     *            has at least one element in it
     * @return minimum element of the array of ints
     */
    public static int min(int[] nums){
        return 0;
    }

    /**
     * Creates and returns a new List that contains all the
     * even elements in the passed-in List
     * @param nums
     * @param index
     * @param ret
     * @return
     */
    private static List<Integer> allEvens(List<Integer> nums,
                                          int index, List<Integer> ret){
        if(index >= nums.size()){
            return ret;
        } else {
            if(nums.get(index) % 2 == 0){
                ret.add(nums.get(index));
            }
            return allEvens(nums, index + 1, ret);
        }
    }
    /**
     * Wrapper method for allEvens
     * Creates and returns a new List that contains all the
     * even elements in the passed-in List
     * @param nums List of Integers
     * @return List of all the even Integers
     * in the passed-in List
     */
    public static List<Integer> allEvens(List<Integer> nums){
        List<Integer> ret = new ArrayList<>();
        return allEvens(nums , 0 , ret);

    }

    public static void main(String[] args) {
        int[] nums = {0, -3, 5, 9, 1, -4, -4, 2};
        int minValue = min(nums);
        System.out.println("Array: ");
        Arrays.stream(nums).forEach(a -> System.out.print(a + " "));
        System.out.println();
        System.out.println("Min value: \n"+minValue);

        List<Integer> list = new ArrayList<>(Arrays.asList(0, -3, 5, 9, 1, -4, -4, 2));
        List<Integer> result = allEvens(list);
        System.out.println("List: ");
        System.out.println(list);
        System.out.println("Even elements: ");
        System.out.println(result);
    }
}
