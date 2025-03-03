package wk6;

public class MysteryMethodExamples {
    public static void main(String[] args) {
        int n = 10;
        //        System.out.println("Mystery 1 method with n "
//                + n + ". k: " + MysteryMethod1(n, 0));

//        int[] values = {1, 2, 4, 8, 10, 16, 32, 64, 100, 256, 512, 1024, 10_000, 100_000, 100_000_000};
//        for(int n: values) {
//            System.out.println("Mystery method with n "
//                    + n + ". k: " + MysteryMethod1(n, 0));
//        }

    }
    public static int MysteryMethod2(int n , int k){
        for(int i = 1; i < n; i*=2){
            k++;
        }
        return k;
    }
    public static int MysteryMethod1(int n , int k){
        for(int i = 1; i < n; i *= 10){
            k++;
        }
        return k;
    }

    public static int numDays(int amount){
        int k = 0;
        while(amount > 1){
            amount = amount / 2;
            k++;
        }
        return k;
    }

    //int[] values = {1, 2, 4, 8, 10, 16, 32, 64, 100, 256, 512, 1024, 10_000, 100_000, 100_000_000};
//        for(int n: values) {
//            System.out.println("Num days to spend "
//                    + n + " dollar. k: " + numDays(n));


}
