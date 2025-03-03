package wk6;

public class ProcessingTimeExample {
    public static void main(String[] args) {

    }
    private static int ProcessingMethod(int n, int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                k++;
                k++;
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            k++;
            k++;
            k++;
            k++;
            k++;
        }
        k++;
        k++;
        k++;
        k++;
        k++;
        k++;
        k++;
        k++;
        k++;
        k++;
        return k;
    }
}
