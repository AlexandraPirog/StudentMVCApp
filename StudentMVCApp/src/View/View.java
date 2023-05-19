package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Scanner;

public class View implements iGetView {
    /**
     * Метод вывода списка студентов в терминал
     * @param students
     */
    public void printAllStudent(List<Student> students){
        System.out.println("---------------Вывод списка студентов------------");
        for (Student person: students){
            System.out.println(person);
        }
        System.out.println("---------------Конец списка------------");
    }


    public String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
