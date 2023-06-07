package StudentDomain;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;

    /**
     * Java class constructor
     * @param firstName Person's first name
     * @param lastName Person's lastName
     * @param age Person's age
     */
    public Person(String firstName, String lastName, int age)
    {
        this.firstName=firstName;
        this.lastName = lastName;
        this.age=age;
    }

    /**
     * Person Java class method
     * @return Person's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Person Java class method
     * @return Person's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Person Java class method
     * @return Person's age
     */
    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}