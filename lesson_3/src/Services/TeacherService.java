package Services;

import StudentDomain.Employee;
import StudentDomain.PersonComparator;
import StudentDomain.Student;
import StudentDomain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {
    private final List<Teacher> teachers;

    /**
     * Java class constructor
     * Creates list of teachers
     */
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return this.teachers;
    }


    @Override
    public void create(String firstName, String lastName, int age) {
        Teacher teacher = new Teacher(firstName, lastName, age, "No info, set academic degree");
        teachers.add(teacher);
    }


    /**
     * Method sorts teachers by last name and first name
     * @return Sorted list of teachers
     */
    public List<Teacher> getSortedByFIOTeacher() {
        List<Teacher> newTeachers = new ArrayList<Teacher>(teachers);
        newTeachers.sort(new PersonComparator<Teacher>());
        return newTeachers;
    }


}
