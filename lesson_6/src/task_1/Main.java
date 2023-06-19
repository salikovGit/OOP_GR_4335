package task_1;

import java.time.Instant;
import java.util.Date;

public class Main {


    public static void main(String[] args) {
        Employee emp = new Employee("Ivan", Date.from(Instant.now()), 100000);
        System.out.println(Accounting.calculateNetSalary(emp));

    }

}
