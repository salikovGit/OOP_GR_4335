package Controller;

import Model.Student;

import java.util.List;

public interface iGetView {
    void printAllStudents(List<Student> students);
    String prompt(String message);
    void print(String message);
}
