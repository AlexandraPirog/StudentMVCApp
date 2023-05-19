package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Scanner;

/**
 * То же самое, но на английском
 */
public class ViewEng implements iGetView {
    public void printAllStudent(List<Student> students){
        System.out.println("---------------The Output of the list of students------------");
        for (Student person: students){
            System.out.println(person);
        }
        System.out.println("---------------The end of the List------------");
    }
    public String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}

