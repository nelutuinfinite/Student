package ro.ulbs.proiectaresoftware.student.student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab2 {
    public static void main(){
        Student n= new Student(120,"Alis","Popa","TI21/2");
        Student j= new Student(112," Maria","Popa","TI21/1");

        List<Student> Clasa= new ArrayList<>();
        Student a= new Student(212, "Ion","Mihai", "21/1");
        Student s1 = new Student(214,"Popa","Maria","21/1");
        Student s2 = new Student(145,"Ban","Ion","21/1");
        Student s3 = new Student(211,"Sufana","Cristi","22/1");
        Student s4 = new Student(231,"Radu","Ioana","21/2");
        Clasa.add(a);
        Clasa.add(s1);
        Clasa.add(s2);
        Clasa.add(s3);
        Clasa.add(s4);
        Clasa.add(n);
        Clasa.add(j);
        Clasa.stream().forEach(e->{System.out.println(e.toString());});
            //b
            Clasa.stream().forEach(e->{if(e==n){System.out.println(e);};});
            //c
            Clasa.stream().forEach(e->{if(e==j){System.out.println(e);};});
        //temaLab2
        Set<Student> setClasa = new HashSet<>(Clasa);
        if (setClasa.contains(n)) {
            System.out.println(n);
        }
        if (setClasa.contains(j)) {
            System.out.println(j);
        }
    }
}
