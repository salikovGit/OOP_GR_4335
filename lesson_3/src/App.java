import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.StudentController;
import Services.AverageAge;
import Services.StudentService;
import StudentDomain.Person;
import StudentDomain.Student;
import StudentDomain.StudentGroup;
import StudentDomain.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {
        Person man = new Person("Денис", "Криницын", 35);
        //System.out.println(man.toString());

        Student pers1 = new Student("Денис", "Криницын", 35, 1);
        //System.out.println(pers1.toString());

        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);

        List<Student> listStud1 = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();
        List<Student> listStud3 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud2.add(s2);
        listStud2.add(s3);
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        listStud3.add(pers1);

        StudentGroup group4335 = new StudentGroup(listStud1, 4335);
        StudentGroup group4336 = new StudentGroup(listStud2, 4336);
        StudentGroup group416 = new StudentGroup(listStud3, 416);

        for(Student stud:group4335)
        {
            System.out.println(stud.toString());
        }

        System.out.println("===============================");
        Collections.sort(group4335.getGroup());

        for(Student stud:group4335)
        {
            System.out.println(stud.toString());
        }
        System.out.println("============= HW ===============");
        StudentStream ss = new StudentStream(1);
        ss.addGroup(group4335);
        ss.addGroup(group4336);
        ss.addGroup(group416);
        for (StudentGroup group:ss.getGroupList()){
            System.out.println(group);
        }
        Collections.sort(ss.getGroupList());
        System.out.println("Sorted:");
        for (StudentGroup group:ss.getGroupList()){
            System.out.println(group);
        }
        System.out.println(ss);
        StudentService studServ = new StudentService();
        studServ.create("Piter", "Parker", 21);
        studServ.create("Mary", "Jane", 18);
        studServ.create("May", "Parker", 45);
        AverageAge.avgAge(studServ.getAll());
    }
}