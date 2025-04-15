package wk12.monday;

public class RecursionExamplesR1 {
    public static int Mystery1(int n){
        if(n == 1){
            return n;
        } else {
            return n + Mystery1(n - 1);
        }
    }


    public static String Mystery2(String str){
        if(str.isEmpty()){
            return "";
        } else {
            if(str.charAt(0) != 'o'){
                return str.charAt(0) +
                        Mystery2(str.substring(1));
            } else {
                return "*" +
                        Mystery2(str.substring(1));
            }
        }
    }
    public static String allStarTail(String str){
        return allStarTail(str,"");
    }
    public static String allStarTail(String str, String ret){
        if(str.isEmpty()){
            return ret;
        } else {
            if(str.charAt(0) == 'o'){
                return allStarTail(str.substring(1), ret + "*");
            } else {
                return allStarTail(str.substring(1), ret + str.charAt(0));
            }

        }
    }

    public static boolean Mystery3(int[] nums, int index){
        if(index == nums.length - 1){
            return nums[index] % 2 == 0;
        } else {
            if(nums[index] % 2 == 0){
                return true || Mystery3(nums, index + 1);
            } else {
                return false || Mystery3(nums, index + 1);
            }
        }
    }


//    public static boolean hasEvenLoop(int[] nums){
//        boolean ret = false;
//        for(Integer i:nums){
//            if(i % 2 == 0){
//                ret = true;
//            }
//        }
//        return ret;
//    }

    public static void main(String[] args) {
        System.out.println("Mystery 1");
        System.out.println(Mystery1(1));
        System.out.println(Mystery1(3));
        System.out.println(Mystery1(5));

        System.out.println("Mystery 2");
        System.out.println(Mystery2("horn"));
        System.out.println(Mystery2("bar"));
        System.out.println(Mystery2("hello world"));

        System.out.println("allStarTail");
        System.out.println(allStarTail("horn", ""));
        System.out.println(allStarTail("bar", ""));
        System.out.println(allStarTail("hello world", ""));

        System.out.println("allStarTail");
        System.out.println(allStarTail("horn" ));
        System.out.println(allStarTail("bar"));
        System.out.println(allStarTail("hello world"));

        System.out.println("Mystery 3");
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,3,5,7,9};
        int[] nums3 = {13,3,4,15,1};

        System.out.println(Mystery3(nums1, 0));
        System.out.println(Mystery3(nums2, 0));
        System.out.println(Mystery3(nums3, 0));

//        System.out.println(hasEvenA1(nums1, 0));
//        System.out.println(hasEvenA1(nums2, 0));
//        System.out.println(hasEvenA1(nums3, 0));
//        System.out.println(hasEvenA1(nums1));
//        System.out.println(hasEvenA1(nums2));
//        System.out.println(hasEvenA1(nums3));
//
//        System.out.println(hasEvenA2(nums1, 0));
//        System.out.println(hasEvenA2(nums2, 0));
//        System.out.println(hasEvenA2(nums3, 0));
//
//        System.out.println(hasEvenTail(nums1, 0, false));
//        System.out.println(hasEvenTail(nums2, 0, false));
//        System.out.println(hasEvenTail(nums3, 0, false));
    }
}



//    public static int sumNLoop(int n){
//        int ret = 0;
//        for(int i = n; i>=1; i--){
//            ret += i;
//        }
//        return ret;
//    }

//
//    //Wrapper method
//    public static String allStarTail(String str){
//        return allStarTail(str, "");
//    }
//    //Recursive method
//    public static String allStarTail(String str, String ret){
//        if(str.isEmpty()){
//            return ret;
//        } else {
//            if(str.charAt(0) != 'o'){
//                return allStarTail(str.substring(1), ret + str.charAt(0));
//            } else {
//                return allStarTail(str.substring(1), ret + "*");
//            }
//        }
//    }



//    public static boolean hasEvenA1(int[] nums){
//        return hasEvenA1(nums, 0);
//    }
//    private static boolean hasEvenA1(int[] nums, int index){
//        if(index >= nums.length){
//            return false;
//        } else {
//            if(nums[index] % 2 == 0){
//                return true;
//            } else {
//                return hasEvenA1(nums, index + 1);
//            }
//        }
//    }
//    public static boolean hasEvenA2(int[] nums, int index){
//        if(index == nums.length - 1){
//            return nums[index] % 2 == 0;
//        } else {
//            return nums[index] % 2 == 0 || hasEvenA1(nums, index + 1);
//        }
//    }
//
//    public static boolean hasEvenTail(int[] nums, int index, boolean ret){
//        if(index >= nums.length){
//            return ret;
//        } else {
//            if(nums[index] % 2 == 0){
//                ret = true;
//                //could also just return true;
//                //and terminate the recursion
//            }
//            return hasEvenTail(nums, index, ret);
//        }
//    }
//
