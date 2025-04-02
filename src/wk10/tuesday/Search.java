package wk10.tuesday;

public class Search {

    public static int linearSearchIt(Integer[] list, Integer target){
        int ret = -1;
        for(int i = 0; i < list.length && ret == -1; i++){
            if(list[i].equals(target)){
                ret = i;
            }
        }
        return ret;
    }
    public static int linearSearch(Integer[] list, Integer target){
        return linearSearch(list, target, 0);
    }
    public static int linearSearch(Integer[] list, Integer target, Integer index){
        if(index >= list.length){
            return -1;
        } else{
            if(target.compareTo(list[index]) == 0){
                return index;
            } else {
                return linearSearch(list, target, index + 1);
            }
        }
    }

    public static int binarySearch(Integer[] list, Integer target){
        return binarySearch(list, target, 0, list.length - 1);
    }
    public static int binarySearch(Integer[] list,
                                   Integer target, Integer top, Integer bot){
        if(top > bot){
            return -1;
        } else {
            int mid = (top + bot) / 2;
            if(list[mid].compareTo(target) == 0){
                return mid;
            } else if(target.compareTo(list[mid]) < 0){
                return binarySearch(list, target, top , mid - 1);
            } else{
                return binarySearch(list, target, mid + 1, bot);
            }


        }
    }
    public static void main(String[] args) {
        Integer[] nums1 = {9,2,7,3,4,6,5};
        System.out.println("Linear Search unsorted");
        System.out.println(linearSearch(nums1, 0));
        System.out.println(linearSearch(nums1, 10));
        System.out.println(linearSearch(nums1, 9));
        System.out.println(linearSearch(nums1, 3));
        System.out.println(linearSearch(nums1, 5));

        System.out.println("Linear search sorted");
        Integer[] nums2 = {2,3,5,7,8,10};
        System.out.println(linearSearch(nums2, 0));
        System.out.println(linearSearch(nums2, 11));
        System.out.println(linearSearch(nums2, 2));
        System.out.println(linearSearch(nums2, 5));
        System.out.println(linearSearch(nums2, 10));

        System.out.println("Binary Search sorted");
        System.out.println(binarySearch(nums2, 0));
        System.out.println(binarySearch(nums2, 11));
        System.out.println(binarySearch(nums2, 2));
        System.out.println(binarySearch(nums2, 5));
        System.out.println(binarySearch(nums2, 10));
    }
}
