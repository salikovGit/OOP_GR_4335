package Model;
import Controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashModel implements iGetModel{
    private final HashMap<Integer, Student> students;

    /**
     * Java class HasModel constructor
     * @param students List of students who will be included in model
     */
    public HashModel(List<Student> students) {
        this.students = new HashMap<>();
        for (int i = 0; i < students.size(); i++) {
            this.students.put(students.get(i).getId(), students.get(i));
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    @Override
    public String deleteStudent(int id) {
        if (students.containsKey(id)) {
            students.remove(id);
            return "Student deleted";
        } else {
            return "Student not found";
        }
    }

}
