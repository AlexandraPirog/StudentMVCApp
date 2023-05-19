package Model;

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    /**
     * Конструктор, модели вывода списка студентов
     * @param students
     */
    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudent()
    {
        return students;
    }

    /**
     * описывает команду удаления студента из списка по Id студента, если такого нет, то выводится соотв. сообщение
     * @param studentId - Id студента
     */
    @Override
    public void deleteStudent(Long studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentId) {
                students.remove(i);
            }
            else{
                System.out.println("Такого студетна нет в базе данных!");
            }
        }
    }
}