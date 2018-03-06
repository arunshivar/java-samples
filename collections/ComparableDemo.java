package collections;

import java.util.ArrayList;
import java.util.Collections;

/* Output
*   1000.0 Shiva
*   1000.0 Rama
*   10000.0 Arun
*   10080.0 Rocky
*   10500.0 Ram
*   10900.0 Rock
*   18000.0 Stallone
*/
public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(new Employee("Arun", 10000));
        arrayList.add(new Employee("Shiva", 1000));
        arrayList.add(new Employee("Ram", 10500));
        arrayList.add(new Employee("Rock", 10900));
        arrayList.add(new Employee("Rocky", 10080));
        arrayList.add(new Employee("Stallone", 18000));
        arrayList.add(new Employee("Rama", 1000));

        Collections.sort(arrayList);

        for(Employee employee: arrayList) {
            System.out.println(employee.salary+" "+employee.name);
        }
    }


}
