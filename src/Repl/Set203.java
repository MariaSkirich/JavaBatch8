package Repl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set203 {
    public static void main(String[] args) {
        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(new Employee("John Doe", 123456789, 80000.0));
        employees.add(new Employee("Jane Smith", 987654321, 90000.0));
        employees.add(new Employee("Jackie Chan", 0, 1_000_000.0));

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee next = iterator.next();
            System.out.println(next.getFullName());
            System.out.println(next.getSsn());
            System.out.println(next.getSalary());

        }

    }


}

class Employee {
    private String fullName;
    private int ssn;
    private double salary;

    Employee(String fullName, int ssn, double salary) {
        this.fullName = fullName;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

}
