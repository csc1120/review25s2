package wk2.monday;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String filename1 = "src/wk2/monday/text1.txt";
        String filename2 = "src/wk2/monday/text2.txt";
        int[] values = {1,2,3,4,5};
        try {
            String contents = readFile(filename1);
            writeArray(filename2, values);
        } catch (FileNotFoundException e){
            System.out.println("Error finding the file");
            System.out.println(e.getMessage());
        }
//        finally {
//            if(printWriter != null){
//                printWriter.close();
//            }
//        }
    }

    private static String readFile(String filename)
            throws FileNotFoundException{
        Scanner fileIn = null;
        String ret = "";
        //relative path
        fileIn = new Scanner(new FileInputStream(filename));
        while(fileIn.hasNext()){
            ret += fileIn.next();
        }
        return ret;
    }
    private static void writeArray(String filename, int[] values)
            throws FileNotFoundException{
        try (PrintWriter printWriter
                     = new PrintWriter(new FileOutputStream(filename));) {
            for (int i = 0; i < values.length; i++) {
                printWriter.print(values[i] + " ");
            }
            //printWriter.close();
        }
    }
}
