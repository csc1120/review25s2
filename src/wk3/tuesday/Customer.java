package wk3.tuesday;

public class Customer extends Person {
    private double money;
    public Customer(String name, int age,
                    String role, double money){
        super(name, age, role);
        this.money = money;
    }
    public double spend(){
        return money;
    }
    public String getRole(){
        return "Customers";
    }
    @Override
    public String toString() {
        return "Customer\n"+super.toString()+"\nMoney"+money;
    }
}
