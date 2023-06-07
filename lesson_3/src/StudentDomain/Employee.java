package StudentDomain;

public class Employee extends Person{
    private String occupation;

    /**
     * Java class constructor
     * @param firstName Employee's first name
     * @param lastName Employee's last name
     * @param age Employee's age
     * @param occupation Employee's occupation
     */
    public Employee(String firstName, String lastName, int age, String occupation) {
        super(firstName, lastName, age);
        this.occupation = occupation;
    }
}