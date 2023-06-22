package Model;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;

    /**
     * Конструктор класса
     * @param firstName Имя
     * @param lastName Фамилия
     * @param age Возраст
     */
    public Person(String firstName, String lastName, int age)
    {
        this.firstName=firstName;
        this.lastName = lastName;
        this.age=age;
    }

    /**
     * Java class Person method
     * @return Persons first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Java class Person method
     * @return Persons last name
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * Java class Person method
     * @return Persons age
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