package Model;

public class Student extends User implements Comparable<Student>{
    private long studentID;

    /**
     * конструктор, кот. задает параметры студента
     * @param firstName - имя
     * @param secondName - фамилия
     * @param age - возраст
     * @param studentID- айди студента
     */
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }


    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    /**
     * override метода to String, который выводит инф-ю на экран
     * @return
     */
    @Override
    public String toString() {
        return "Student{"

                +"firstName=" +super.getFirstName()
                +", secondName=" +super.getSecondName()
                +", age=" +super.getAge()+
                ", studentID=" + studentID +
                '}';
    }

    /**
     * Компаратор, выводит отсортированный список
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student o) {

        System.out.println(super.getFirstName()+" - "+o.getFirstName());
        if(super.getAge()==o.getAge())
        {
            if(this.studentID==o.studentID)
            {
                return 0;
            }
            if(this.studentID<o.studentID)
            {
                return -1;
            }
            return 1;
        }
        if(super.getAge()<o.getAge())
        {
            return -1;
        }
        return 1;
    }
}