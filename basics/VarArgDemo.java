package basics;

class Example {

    void m1(int a) {
        System.out.println("Parent class int arg");
    }

    void m1(int... a) {
        System.out.println("Parent class var-arg");
    }
}

public class VarArgDemo  extends Example {

    void m1(int a) {
        System.out.println("Child class int arg");
    }
    public static void main(String[] args) {

        VarArgDemo varArgDemo = new VarArgDemo();

        varArgDemo.m1(); // Parent class var-arg
        varArgDemo.m1(10); // Child class int arg

        Example e = new VarArgDemo();
        e.m1(); // Parent class var-arg
        e.m1(10); // Child class int arg

    }
}
