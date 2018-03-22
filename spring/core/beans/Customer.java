package spring.core.beans;

public class Customer
{

    private Person person;

    private Person p;
    public Customer() {
    }

    public Customer(Person person) {
        this.person = person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void showDetails() {
        System.out.println(this.person.id+" "+this.person.name);
    }
}

