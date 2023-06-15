package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomain.PersonComparator;
import StudentDomain.Student;

public class StudentService implements iPersonService<Student> {
    private int count;
    private final List<Student> students;

    /**
     * Java class StudentService constructor
     * Creates list of students
     */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }
    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Student per = new Student(firstName, lastName, age, count);
        count++;
        students.add(per);
    }


    /**
     * Method sorts students by last name and first name
     * @return Sorted list of students
     */
    public List<Student> getSortedByFIOStudentsList()
    {
        List<Student> newStudList = new ArrayList<Student>(students);
        newStudList.sort(new PersonComparator<Student>());
        return newStudList;
    }

}