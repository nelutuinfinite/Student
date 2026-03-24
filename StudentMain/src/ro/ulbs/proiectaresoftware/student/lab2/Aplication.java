package ro.ulbs.proiectaresoftware.student.lab2;
import ro.ulbs.proiectaresoftware.student.student.Student;

import java.util.*;

public class Aplication {
    static void main(){
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
        Clasa.stream().forEach(e->{System.out.println(e.toString());});
        Clasa.stream().forEach(e->{if(e==n){System.out.println(e);};});
        Clasa.stream().forEach(e->{if(e==j){System.out.println(e);};});
        List<Integer> x =new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusy= new ArrayList<>();
        Set<Integer> zSet = new TreeSet<>();
        List<Integer> xMinusy= new ArrayList<>();
        List<Integer> xPlusYLimitedByP= new ArrayList<>();
        List<Integer> Temp = new ArrayList<>();
        Integer h= new Integer(2);

        Random z = new Random();
        for(int i=0;i<10;i++){
        x.add(z.nextInt(11));
        }
        for(int i=0;i<10;i++){
        y.add(z.nextInt(11));
        }
         xPlusy.addAll(x);
         xPlusy.addAll(y);
         xPlusy.stream().forEach(e->{System.out.print(e+" ");});
        System.out.println();

         zSet.addAll(x);
         zSet.retainAll(y);
         zSet.stream().forEach(e->{System.out.print(e+" ");});
        System.out.println();
         xMinusy.addAll(x);
         xMinusy.retainAll(y);
        xMinusy.stream().forEach(e->{System.out.print(e+" ");});
        System.out.println();
        xPlusYLimitedByP.addAll(xPlusy);
        xPlusYLimitedByP.stream().forEach(e->{System.out.print(e+" ");});
        System.out.println();
        xPlusYLimitedByP.removeIf(g->g>5    );
        xPlusYLimitedByP.stream().forEach(e->{System.out.print(e+" ");});
    }
}
