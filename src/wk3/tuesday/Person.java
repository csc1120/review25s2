package wk3.tuesday;

public abstract class Person {
    private String name;
    private int age;
    private String role;

    public Person(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
    public boolean isAdult(){
        return age >= 18;
    }
    public abstract String getRole();

    public String toString(){
        return "Name:"+name;
    }
}
