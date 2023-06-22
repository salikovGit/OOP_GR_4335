package Controller;

import Model.Student;

import java.util.List;

public interface iGetView {
    /**
     * Method prints info in console
     * @param students List of students in model
     */
    void printAllStudents(List<Student> students);

    /**
     * Method reads info from console
     * @param message text to print in console
     * @return text from console
     */
    String prompt(String message);

    /**
     * Method prints info to console
     * @param message Text which will be printed to user
     */
    void print(String message);
}
