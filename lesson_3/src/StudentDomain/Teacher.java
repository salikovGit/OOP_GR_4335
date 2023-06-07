package StudentDomain;

public class Teacher extends Person{
    private String acadDegree;

    /**
     * Java class constructor
     * @param firstName Teacher's first name
     * @param secondName Teacher's second name
     * @param age Teacher's age
     * @param acadDegree Teacher's academical degree
     */
    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }
}