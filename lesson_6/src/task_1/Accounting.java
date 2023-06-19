package task_1;

public class Accounting {
    public static int calculateNetSalary(Employee employee) {
        int tax = (int) (employee.getBaseSalary() * 0.25);
        return employee.getBaseSalary() - tax;
    }
}
