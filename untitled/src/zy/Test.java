package zy;

public class Test {
    public static void main(String[] args) {
        People student=new Student();
        People teacher=new Teacher();
        student.show();
        teacher.show();
        Student a=(Student) student;
        a.xs();
        Teacher b=(Teacher) teacher;
        b.ls();

    }
}
