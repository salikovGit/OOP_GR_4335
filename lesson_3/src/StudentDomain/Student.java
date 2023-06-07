package StudentDomain;

public class Student extends Person implements Comparable<Student>{
    private final int id;

    /**
     * Java class constructor
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param age Student's age
     * @param id Student's unique ID
     */
    public Student(String firstName, String lastName, int age, int id) {
        super(firstName, lastName, age);
        this.id = id;
    }

    /**
     * @return Student's ID
     */
    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.firstName + '\'' +
                ", secondName='" + super.getLastName() + '\'' +
                ", age=" + super.getAge() +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(super.getFirstName()+" - "+o.getFirstName());
        if(this.getAge()==o.getAge())
        {
            if(this.getId()==o.getId())
            {
                return 0;
            }
            if(this.getId()<o.getId())
            {
                return -1;
            }
            return 1;
        }
        if(this.getAge()<o.getAge())
        {
            return -1;
        }
        return 1;
    }
}
