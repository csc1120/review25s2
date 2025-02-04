package wk3.prep;

import java.util.ArrayList;
import java.util.List;

public class DepartmentStore {
    public static void main(String[] args) {
        List<Person> personList = loadOccupants("foobar.txt");
        for(Person p:personList){
            System.out.println(p.toString());
        }
    }
    public static ArrayList<Person> loadOccupants(String filename){
        return null;
    }
}
