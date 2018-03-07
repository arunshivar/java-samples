package ExceptionHandling;
/* Output
  try
  finally
* */
public class Demo1 {

    static void m1() {
        try {
            System.out.println("try");
            // throw new Exception();
            return;
        }
        catch(Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
    public static void main(String[] args) {
        m1();
    }
}
