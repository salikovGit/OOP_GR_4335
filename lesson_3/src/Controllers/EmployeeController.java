package Controllers;

import Services.EmployeeService;
import StudentDomain.Employee;

public class EmployeeController implements iPersonController<Employee> {

    private final EmployeeService empServ = new EmployeeService();

    @Override
    public void create(String firstName, String secondName, int age) {
        empServ.create(firstName, secondName, age);
    }

    /**
     * Pay salary to a person
     * @param person A person who gets a salary
     * @param <T> Instance of class Person
     */
    static public <T extends Employee> void paySalary(T person)
    {
        System.out.println((person).getFirstName() + " выплачена зарплата 10000р.");
        //return person;
    }

}