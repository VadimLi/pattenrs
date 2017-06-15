package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private final String name;

    private final String dept;

    private final int salary;

    private final List<Employee> subordinates;

    public Employee(final String name,
                    final String dept,
                    final int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    public void add(final Employee e) {
        subordinates.add(e);
    }

    public void remove(final Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

}
