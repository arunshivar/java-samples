import basics.Human;

//Demonstrate static binding vs dynamic binding
//
public class Boy extends Human {
    public static void walk() {
        System.out.println("Boy Walks");
    }

    public void eat() {
        System.out.println("Boy Eats");
    }

    public static void main(String[] args) {

        Human obj1 = new Boy();
        Boy obj2 = new Boy();

        obj1.walk(); // static binding
        obj1.eat(); //  dynamic binding

        obj2.walk(); // static binding
        obj2.eat(); //  dynamic binding

    }
}
