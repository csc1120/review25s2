package wk3.prep;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{
    private double money;
    List<String> items;
    public Customer(String name, int age, double money) {
        super(name, age);
        this.money = money;
        items = new ArrayList<>();
    }
    public boolean canBuy(double price){
        return price <= money;
    }
    public void buy(double price, String item){
        if(canBuy(price)){
            money -= price;
            items.add(item);
        }
    }
    public String toString(){
        return "Customer\n"+super.toString()+"\nMoney:"+money+"\nItems:"+items;
    }
}
