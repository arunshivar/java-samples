package ExceptionHandling;

public class Demo {

    static void m1() {
        System.out.println("1");   // => 1
        try {
            System.out.println(2/0);  // exception is raised here
        }
        catch(ArithmeticException ae) {
            System.out.println("4"); // => 4

            System.out.println(10/0); // Exception occurs but not caught so terminates

            System.out.println("5");
        }

        System.out.println("6");
    }

    public static void main(String[] args) {
        m1();
    }
}
