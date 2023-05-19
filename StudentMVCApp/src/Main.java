import Controller.Controller;

import Model.Model;
import Model.Student;
// import View.View;
import View.ViewEng;
import Model.FileRepo;
import Controller.iGetModel;
import Controller.iGetView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        FileRepo fileRepo = new FileRepo("StudentDb.txt");
        for(Student pers: students){
            fileRepo.addStudent(pers);
        }
        fileRepo.saveAllStudentToFile();

        iGetModel model = new Model(students);
        iGetModel modelFileRepo = fileRepo;
        iGetView view = new ViewEng();
//      iGetView view = new View();
        Controller controller = new Controller(view,modelFileRepo);
        controller.run();
        //controller.updateView();

    }
}