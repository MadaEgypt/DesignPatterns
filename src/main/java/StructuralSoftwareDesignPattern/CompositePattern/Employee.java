package StructuralSoftwareDesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name ;
    private String department ;
    private float salary ;
    private List<Employee> subOrdinates;

    public Employee(String name, String department, float salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.subOrdinates = new ArrayList<Employee>();
    }
    public void add (Employee employee){
        subOrdinates.add(employee);
    }
    public void remove (Employee employee){
        subOrdinates.remove(employee);
    }
    public ArrayList<Employee> getSubOrdinates() {
        return (ArrayList<Employee>) subOrdinates;
    }
    public String getName() {
        return name;
    }

}
