package wk3.tuesday;
public class Employee extends Person {
    private int id;
    private double rate;
    public Employee(String name, int age, String role,
                    int id, double rate) {
        super(name, age, role);
        this.id = id;
        this.rate = rate;
    }
    public double pay(){
        return rate;
    }
    public String getRole(){
        return "Employee";
    }
    public String toString(){
        return "Employee\n"+super.toString()+"\nId"+id;
    }
}
