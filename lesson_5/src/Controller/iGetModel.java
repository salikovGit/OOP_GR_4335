package Controller;

import Model.Student;

import java.util.List;

public interface iGetModel {
    public List<Student> getAllStudents();
    public String deleteStudent(int id);
}
