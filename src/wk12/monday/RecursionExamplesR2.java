package wk12.monday;

public class RecursionExamplesR2 {
    /**
     * returns the factorial of n (i.e. n1)
     * @param n value to compute
     * @return factorial of n
     */
    public static int factorial(int n){
        return 0;
    }

    /**
     * Returns true is the characters in the str are
     * in alphabetical order. For example, "ace" would
     * return true and "bar" would return false. A String
     * of length 1 or the empty String would return true
     * @param str String to check
     * @return true if characters in the String are in order or
     * the length of the String is less than 1
     */
    public static boolean inOrder(String str){
        return false;
    }


    /**
     * counts and returns the number of adjacent 11s
     * that are not overlapping. so {2,11,11,3} should
     * return 1 and {2,3,11,11,11,3,11,11,9} should return
     * 2
     * @param nums array of ints
     * @param index current element to examine
     * @return number of adjacent, non overlapings 11s
     */
    private static int adjacent11(int[] nums, int index){
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("factorial");
        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(5));

        System.out.println("inOrder");
        System.out.println(inOrder("ace"));
        System.out.println(inOrder("bar"));
        System.out.println(inOrder(""));

        System.out.println("Adjacent11s");
        int[] nums1 = {2,3,11,11,11,3,11,11,9};
        int[] nums2 = {2,11,11,3};
        int[] nums3 = {5,2,11,11};
        int[] nums4 = {};
        System.out.println(adjacent11(nums1, 0));
        System.out.println(adjacent11(nums2, 1));
        System.out.println(adjacent11(nums3,2 ));
        System.out.println(adjacent11(nums4,3));

    }
}
