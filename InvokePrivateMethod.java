import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// to invoke a private method using reflection api
public class InvokePrivateMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class c = Class.forName("Human");

        Object o = c.newInstance();

        Method m = c.getDeclaredMethod("sleep", null);

        m.setAccessible(true);

        m.invoke(o,null);

    }
}
