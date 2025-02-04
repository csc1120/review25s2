package wk3.prep;

public class Employee extends Person implements Payable {
    private int id;
    public Employee(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
    public double pay(){
        return 1000;
    }
    @Override
    public String toString() {
        return "Employee\n"+super.toString()+"\nID:"+id;
    }
}
