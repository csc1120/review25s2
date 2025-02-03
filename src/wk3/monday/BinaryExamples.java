package wk3.monday;

import java.io.*;
import java.nio.file.Files;

public class BinaryExamples {
    public static void main(String[] args) {

        String filename = "test.bin";
        int[] values = {1,2,3,4,5};
        try(FileOutputStream out = new FileOutputStream(filename);
            DataOutputStream dataOut = new DataOutputStream(out)) {
            for(int i = 0; i<values.length;i++){
                dataOut.writeInt(values[i]);
            }

        } catch (FileNotFoundException e){
            System.out.println("Unable to open file");
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println("Unable to write to file");
            System.out.println(e.getMessage());
        }

        try(FileInputStream fIn = new FileInputStream(filename);
            DataInputStream dIn = new DataInputStream(fIn)){
            for(int i = 0; i<5; i++){
                System.out.println(dIn.readInt());
            }
        }catch (FileNotFoundException e){
            System.out.println("Unable to open file");
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println("Unable to write to file");
            System.out.println(e.getMessage());
        }

    }
}
