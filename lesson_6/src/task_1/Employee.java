package task_1;

import java.util.Date;

public class Employee {
    private final String name;
    private final Date dob;


    public int getBaseSalary() {
        return baseSalary;
    }

    private int baseSalary;
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
