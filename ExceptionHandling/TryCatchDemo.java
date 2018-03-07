package ExceptionHandling;
/*Output
Main
Main => try
M1
Main => catch
main end
*/


public class TryCatchDemo {

    static void m1() throws ArithmeticException {
        System.out.println("M1");
        System.out.println(10/0);
        System.out.println("End of  m1");
    }
    public static void main(String[] args) {
        System.out.println("Main");
        try {
            System.out.println("Main => try");
            m1();
            System.out.println("Main => end of try");
        }
        catch(ArithmeticException ae) {
            System.out.println("Main => catch");
        }
        System.out.println("main end");
    }
}
