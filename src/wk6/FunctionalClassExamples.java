package wk6;

public class FunctionalClassExamples {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Method1 with n "
                +n+". k: "+ Method1(n,0));
    }
    public static int Method1(int n, int k) {
        for (int i = 0; i < n; i++) {
            k++;
            k++;
            k++;
            k++;
            k++;
        }
        return k;
    }
    public static int Method2(int n, int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                k++;
            }
        }
        return k;
    }

    public static int Method3(int n, int k) {
        for (int i = 10; i < n; i++) {
            for (int j = 10000; j < n; j++) {
                for (int r = 1000; r < n; r++) {
                    k++;
                }
            }
        }
        return k;
    }




    public static int Method4(int n, int k) {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 4; j++) {
                for (int r = 0; r < 3; r++) {
                    k++;
                }
            }
        }
        return k;
    }
    public static int Method5(int n, int k) {
        System.out.println("The ");
        k++;
        System.out.println("quick ");
        k++;
        System.out.println("brown ");
        k++;
        System.out.println("fox ");
        k++;
        return k;
    }
    public static int Method6(int n, int m, int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                k++;
            }
        }
        return k;
    }






}
