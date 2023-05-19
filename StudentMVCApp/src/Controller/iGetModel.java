package Controller;

import java.util.List;
import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudent();

    void deleteStudent(Long studentId);
//    public List<Student> getAllStudent();
}
