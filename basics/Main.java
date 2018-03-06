package basics;

import java.lang.reflect.Method;

class Simple {
    void m1() {
        System.out.println("M1");
    }
    void m2() {
        System.out.println("M2");
    }
    void m3() {
        System.out.println("M3");
    }
}

// Reflection api
public class Main {
    public static void main(String args[]){

        Method[] methods = Simple.class.getMethods();

        for(Method method : methods){
            System.out.println("method = " + method.getName());
        }


    }
}