package wk13.tuesday;

import java.util.function.Consumer;

public class MyPrinterStars implements Consumer<String> {
    public void accept(String s){
        System.out.print("*"+s+"*");
    }
}
