package wk12.monday;

public class RecursionExamplesR3 {

    /**
     * Computes the pow() operations
     * @param base base number to raise
     * @param exponent power to raise the base
     * @return base^power
     */
    public static int power(int base, int exponent){
        return 0;
    }

    /**
     * Checks if all the characters in the passed-in String
     * are lowercase. The empty String should return true
     * @param str Passed in String
     * @return true if all the characters in the String are
     * lowercase or if the String is empty
     */
    private static boolean allLowerCase(String str){
        return false;
    }

    /**
     * Finds the sum of even index elements
     * @param nums array of ints
     * @param index current index
     * @return sums of elements in even indices
     */
    public static int sumEveryOther(int[] nums, int index){
        return 0;
    }

    /**
     * Checks if the passed in String is a palindrome
     * @param str String to check
     * @return true if the pasesed in String is a palindrome
     */
    public static boolean palindrome(String str){
        return false;
    }

    public static void main(String[] args) {

        System.out.println("power");
        System.out.println(power(2,8));
        System.out.println(power(3,3));
        System.out.println(power(10,5));

        System.out.println("allLowerCase");
        System.out.println(allLowerCase("foobar"));
        System.out.println(allLowerCase("cAt"));
        System.out.println(allLowerCase(""));

        System.out.println("sumEveryOther");
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {-3, 6};
        int[] nums3 = {};
        System.out.println(sumEveryOther(nums1, 0));
        System.out.println(sumEveryOther(nums2, 0));
        System.out.println(sumEveryOther(nums3, 0));

        System.out.println("palindrome");
        System.out.println(palindrome("foobar"));
        System.out.println(palindrome("hello world"));
        System.out.println(palindrome("tacocat"));

        /**
         * Expected Answers
         * power
         * 256
         * 27
         * 100000
         * allLowerCase
         * true
         * false
         * true
         * sumEveryOther
         * 9
         * -3
         * 0
         * palindrome
         * false
         * false
         * true
         */
    }
}
