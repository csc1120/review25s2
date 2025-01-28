package wk2.tuesday;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        //String filename = scanner.next();
        String filename1 = "src\\wk2\\tuesday\\test1.txt";
        String filename2 = "src\\wk2\\tuesday\\test2.txt";

        try {
            int ans = readFile(filename1);
            System.out.println("sum was " + ans);
        } catch (FileNotFoundException e){
            System.out.println("Error opening the file");
            System.out.println(e.getMessage());
        }
        try(PrintWriter printWriter =
                    new PrintWriter(new FileOutputStream(filename2));) {
            //FileOutputStream fOut =
            int[] values = {1, 2, 3, 4, 5};

            for (int i = 0; i < values.length; i++) {
                printWriter.print(values[i] + " ");
            }
            //printWriter.close();
        } catch (FileNotFoundException e){
            System.out.println("Can't open file to write");
            System.out.println(e.getMessage());
        }

    }
    public static int readFile(String filename) throws FileNotFoundException{
        FileInputStream fileIO;
        //relative path
        fileIO = new FileInputStream(filename);
        Scanner fileIn = new Scanner(fileIO);
        int sum = 0;
        while(fileIn.hasNext()){
            String input = fileIn.next();
            try {
                sum += Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("One of the value was bad "+input );
                System.out.println(e.getMessage());
            }
        }
        //System.out.println("Sum is "+sum);
        return sum;
    }
}
