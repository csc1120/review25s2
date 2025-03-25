package wk9.monday;

import java.util.ArrayList;

public class temp {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("I");
        a.add("like");
        a.add("beagles");
        a.add(1, "really");
        a.remove(3);
        a.add("penguins");
        a.add(3, "chonkers");
        System.out.println(a);
    }
}
