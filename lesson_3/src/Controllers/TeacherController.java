package Controllers;

import Services.TeacherService;
import StudentDomain.Teacher;

public class TeacherController implements iPersonController<Teacher> {
    TeacherService teach = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        teach.create(firstName, secondName, age);
    }
}
