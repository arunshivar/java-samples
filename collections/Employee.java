package collections;

public class Employee implements Comparable<Employee> {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee employee) {
        if(salary == employee.salary) {
            return 0;
        } else if(salary > employee.salary){
            return 1;
        } else {
            return -1;
        }
    }
}
