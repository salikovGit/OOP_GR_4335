package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Model;
import Model.Student;
import View.View;

public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;

    /**
     * Java class Controller constructor.
     * Initialises application
     * @param view instance of class View
     * @param model instance of class Model
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    /**
     * Java class method. Returns list of students included in model
     */
    public void getAllStudents() {
        students = model.getAllStudents();
    }

    /**
     * Some test method
     * @return true if list of students id not empty
     */
    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method updates students list in view
     */
    public void update() {
        //MVP
        getAllStudents();
        if(testData())
        {
            view.printAllStudents(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }
    }

    /**
     * Main app controller
     */
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case DELETE:
                    String message = view.prompt("Enter student ID you want to delete:\n");
                    view.print(model.deleteStudent(Integer.parseInt(message)));
                    break;
            }

        }
    }

}