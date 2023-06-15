package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomain.Employee;
import StudentDomain.PersonComparator;

public class EmployeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> employees;

    /**
     * Java class EmployeeService constructor
     * Creates list of employees
     */
    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }
    @Override
    public List<Employee> getAll() {
        return employees;
    }
    @Override
    public void create(String firstName, String lastName, int age) {
        Employee per = new Employee(firstName, lastName, age, "basic");
        employees.add(per);
    }

    /**
     * Method sorts employees by last name and first name
     * @return Sorted list of employees
     */
    public List<Employee> getSortedByFIOEmploeeList()
    {
        List<Employee> newEmploiList = new ArrayList<Employee>(employees);
        newEmploiList.sort(new PersonComparator<Employee>());
        return newEmploiList;
    }
}