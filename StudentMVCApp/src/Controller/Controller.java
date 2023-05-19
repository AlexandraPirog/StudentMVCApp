package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import Model.Student;

import Model.Model;
import  View.ViewEng;
//import View.View;

public class Controller {

    private List<Student> students;
    private iGetView view;
    private iGetModel model;

    /**
     * Контроллер
     * @param view - передача информации в интерфейс, которую мы будем видеть на экране
     * @param model -
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    /**
     * getter
     */
    public void getAllStudent()
    {
        students = model.getAllStudent();
    }

    public boolean testData()
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * проверяет, есть ли в списке студенты, если есть- выводит, если нет- пишет, что список пуст
     */
    public void updateView()
    {
        //MVP
        getAllStudent();
        if(testData())
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudent(model.getAllStudent());
    }

    /**
     * Список команд для консоли
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
                    getAllStudent();
                    updateView();
                    break;
                case DELETE:
                    System.out.println("Введите ID студента для удаления: ");
                    Scanner num = new Scanner(System.in);
                    Long studentId = num.nextLong();
                    model.deleteStudent(studentId);
                    break;

            }
            }

        }
    }

