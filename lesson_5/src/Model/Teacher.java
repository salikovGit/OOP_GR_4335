package Model;

public class Teacher extends Person{
    private String acadDegree;

    /**
     * Java class Teacher constructor
     * @param firstName Teachers first name
     * @param secondName Teachers last name
     * @param age Teachers age
     * @param acadDegree Teachers academical degree
     */
    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }
}
