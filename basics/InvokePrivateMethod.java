package basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// to invoke a private method using reflection api
public class InvokePrivateMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class c = Class.forName("basics.Human");

        Object o = c.newInstance();

        // sleep is a private method in Human
        Method m = c.getDeclaredMethod("sleep", null);

        m.setAccessible(true);

        m.invoke(o,null); // Output Human Sleeps

    }
}
