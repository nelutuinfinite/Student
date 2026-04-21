package ro.ulbs.proiectaresoftware.student;

import ro.ulbs.proiectaresoftware.student.student.Student;
import ro.ulbs.proiectaresoftware.student.student.StudentiBursieri;

import java.util.Map;

public class Aplication {
    static void main(){
        Student s1 = new Student(211,"Popa","Maria","21/1");
        Student s2 = new Student(145,"Ban","Ion","21/1");
        Student s3 = new Student(211,"Sufana","Cristi","22/1");
        Student s4 = new Student(211,"Radu","Ioana","21/2");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        Map<Student, StudentiBursieri> bursieri = Map.of(
                new Student(1025,"Andrei","Popa","ISM141/2"),
                new StudentiBursieri(1025,"Andrei","Popa","ISM141/2", 725.50),
                new Student(1024,"Ioan","Mihalcea","ISM141/1"),
                new StudentiBursieri(1024,"Ioan","Mihalcea","ISM141/1",801.10));


    }

}
