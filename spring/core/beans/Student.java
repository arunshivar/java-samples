package spring.core.beans;

public class Student {
    private String name;

    public Student() {
        this.name = "ARUN";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Hello: "+name);
    }



}
