package wk3.monday;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOExamples {
    public static void main(String[] args) {
        String relP = "src/wk3/monday/test.txt";
        //String aP = "C:\\Users\\velez\\OneDrive - Milwaukee School of Engineering\\IntelliJ\\AY2025\\CSC1120Review25s2\\src\\wk3\\monday\\test.txt";
//        try {
//            int sum = readSum(relP);
//            System.out.println(sum);
//        } catch (FileNotFoundException e){
//            System.out.println("Error opening the file");
//            System.out.println(e.getMessage());
//        }

        String filename2 = "src/wk3/monday/test2.txt";
        int[] values = {1,2,3,4,5};
        File file2 = new File(filename2);
        try(PrintWriter printWriter = new PrintWriter(file2)) {
            for(int i = 0; i<values.length + 1; i++){
                printWriter.print(values[i] + " ");
            }
            //printWriter.close();
        } catch (FileNotFoundException e){
            System.out.println("Error opening the file");
            System.out.println(e.getMessage());
        }


    }

    public static int readSum(String filename) throws FileNotFoundException{
        File file = new File(filename);
        int sum = 0;
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            String input = null;
            try {
                input = scanner.next();
                sum += Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Inalid value "+input);
                System.out.println(e.getMessage());
            }
        }
        System.out.println(sum);
        return sum;
    }
}
