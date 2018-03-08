package basics;

class OuterInnerDemo {  // outer classs

    class NonStaticInner {   // non static inner class
        void m1() {
            System.out.println("Non static Inner m1");
        }
        // static void m2()  ==> inner classes cannot have static
        void m2(){
            System.out.println("Non static Inner m2");
        }
    }

    static class StaticInner { // static inner class
        void mehtod() {
            System.out.println("Static inner method");
        }

    }
    public static void main(String[] args)
    {
        OuterInnerDemo outer = new OuterInnerDemo();  // creating outer class object first
        // NonStaticInner class is non static member for outer class
        OuterInnerDemo.NonStaticInner nonStaticInner = outer.new NonStaticInner();

        nonStaticInner.m1(); // Non static Inner m1
        nonStaticInner.m2(); // Non static Inner m2

        OuterInnerDemo.StaticInner staticInner = new OuterInnerDemo.StaticInner();
        staticInner.mehtod(); // Static inner class method


    }
}
