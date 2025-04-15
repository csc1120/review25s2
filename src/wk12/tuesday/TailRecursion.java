package wk12.tuesday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TailRecursion {
    /**
     * Find and return the minimum value in the array. The array
     * has at least one element in it
     * @param nums array of ints
     * @param index current int to investigate
     * @param ret minimum element that will be returned
     * @return minimum element of the array
     */
    public static int min(int[] nums, int index, int minValue){
        if(nums.length == 1){
            return nums[0];
        } else if(index >= nums.length - 1){
            return minValue;
        } else {
            if(nums[index] < minValue){
                return min(nums, index + 1, nums[index]);
            } else {
                return min(nums, index + 1, minValue);
            }
        }
    }
    /**
     * Wrapper method for min
     * @param nums array of ints. assume this is not empty
     * @return minimum element of the array of ints
     */
    public static int min(int[] nums){
        return min(nums, 0, nums[0]);
    }


    /**
     * Creates and returns a new List that contains all the
     * even elements in the passed in List
     * @param nums List of Intergers
     * @param index Current elements we are examining
     * @param ret List of just the even elements
     * @return List of just the even elements
     */

    public static List<Integer> allEvens(List<Integer> nums, int index, List<Integer> ret){
        return null;
    }


    /**
     * Wrapper method for allEvens
     * @param nums List of Integers
     * @return List of all the even Integers in the passed in List
     */
    public static List<Integer> allEvens(List<Integer> nums){
        return null;
    }


    /**
     * Returns the reverse of the passed-in array of ints
     * @param nums array of ints to reverse
     * @param index current index
     * @param ret reversed array
     * @return returns the reverse of the passed-in array
     */
    public static int[] reverse(int[] nums, int index, int[] ret){
        if(index < 0){
            return ret;
        } else {
            ret[nums.length - 1 - index]= nums[index];
            return reverse(nums, index - 1, ret);
        }
    }
    /**
     * Wrapper method for reverse
     * @param nums array of ints to reverse
     * @return reverse of the passed-in array of ints
     */
    public static int[] reverse(int[] nums){
        int[] ret = new int[nums.length];
        return reverse(nums, nums.length -1, ret);
        //return null;
    }

    public static void main(String[] args) {
        System.out.println("Minimum element");
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {-4,-8,3,-1,-5,3};
        int[] nums3 = {5,4,1,3,2,0};
        System.out.println(min(nums1));
        System.out.println(min(nums2));
        System.out.println(min(nums3));

        System.out.println("All even elements");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,5,-4,3,2,4,3,-2));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(5,3,7,9,1));

        System.out.println(allEvens(list1));
        System.out.println(allEvens(list2));
        System.out.println(allEvens(list3));
        System.out.println("reverse");
        try {
            System.out.println(Arrays.stream(reverse(nums1)).boxed().toList());
            System.out.println(Arrays.stream(reverse(nums2)).boxed().toList());
            System.out.println(Arrays.stream(reverse(nums3)).boxed().toList());
        } catch (NullPointerException e){
            System.out.println("Reverse hasn't been implemented.");
        }
        /**
         * Expected output
         * Minimum element
         * 1
         * -8
         * 0
         * All even elements
         * [2, 4, 6, 8, 0]
         * [2, -4, 2, 4, -2]
         * []
         * reverse
         * [5, 4, 3, 2, 1]
         * [3, -5, -1, 3, -8, -4]
         * [0, 2, 3, 1, 4, 5]
         */
    }
}
