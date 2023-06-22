package Controller;

import Model.Student;

import java.util.List;

public interface iGetModel {
    /**
     * Java class method
     * @return list of all students in model
     */
    public List<Student> getAllStudents();

    /**
     * Method deletes a person from model
     * @param id Persons ID
     * @return info about deleting
     */
    public String deleteStudent(int id);
}
