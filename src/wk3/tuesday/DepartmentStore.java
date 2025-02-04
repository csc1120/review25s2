package wk3.tuesday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentStore {
    public static void main(String[] args) {
        //track occupants
        //track employees and expenses
        //track income from either customers or other buisnesses
        String filename = "src/wk3/tuesday/occupants.csv";
        List<Person> persons = null;
        try {
            persons = loadList(filename);
            for(Person p: persons){
//                if(p instanceof Employee){
//                    System.out.println(((Employee) p).pay());
//                }
                System.out.println(p.toString());
            }
        } catch (FileNotFoundException e){
            System.out.println("Can't find the file " + filename);
        }
    }

    public static ArrayList<Person> loadList(String filename)
            throws FileNotFoundException {
        File file = new File(filename);
        ArrayList<Person> persons = new ArrayList<>();
        try(Scanner fileIn = new Scanner(file)){
            //burns the line
            fileIn.nextLine();
            while(fileIn.hasNextLine()) {
                String line = fileIn.nextLine();
                String[] tokens = line.split(",");
                if(tokens[0].equals("2")){
                    persons.add(new Employee(tokens[1],
                            Integer.parseInt(tokens[2].trim()),
                            tokens[3], Integer.parseInt(tokens[4]),
                            Double.parseDouble(tokens[5])));
                } else if(tokens[0].equals("1")){
                    persons.add(new Customer(tokens[1],
                            Integer.parseInt(tokens[2].trim()),
                            tokens[3], Integer.parseInt(tokens[4])));
                }
            }
        }
        return persons;

    }
}
