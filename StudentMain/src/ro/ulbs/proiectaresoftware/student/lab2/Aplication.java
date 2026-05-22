package ro.ulbs.proiectaresoftware.student.lab2;
import ro.ulbs.proiectaresoftware.student.student.Student;

import java.util.*;

public class Aplication {
    static void main(){
        //2.5.1
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
