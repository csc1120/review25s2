package wk3.prep;

public class Person {
    private String name;
    private int age;
    public static final int ADULT_AGE = 18;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean isAdult(){
        return age >= ADULT_AGE;
    }
    @Override
    public String toString() {
        return "Name: "+name;
    }
}
