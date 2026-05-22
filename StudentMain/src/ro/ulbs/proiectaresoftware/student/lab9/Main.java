package ro.ulbs.proiectaresoftware.student.lab9;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.*;

public class Main {
    public static void main(){
    Random a = new Random();
    List<Integer> Interval= Arrays.asList(a.nextInt(25-5+1)+5,a.nextInt(25-5+1)+5,
                                          a.nextInt(25-5+1)+5,a.nextInt(25-5+1)+5,
                                          a.nextInt(25-5+1)+5,a.nextInt(25-5+1)+5,
                                          a.nextInt(25-5+1)+5,a.nextInt(25-5+1)+5,
                                          a.nextInt(25-5+1)+5,a.nextInt(25-5+1)+5);
    Integer rezultat = Interval.stream().reduce(0,(c,b)->c+b);
    System.out.println("Suma Intervalului este "+ rezultat);

    Integer max= Interval.stream().max((c,b)->c>b?c:b).get();
    System.out.println("Valorarea maxima este "+max);

    Integer min = Interval.stream().min((c,b)->c>b?c:b).get();
    System.out.println("Valorarea minima este "+min);

    List<Integer> nouInterval = Interval.stream().filter(e->e>10).filter(e->e<20).toList();
    while(!nouInterval.isEmpty()){
        System.out.print(nouInterval.iterator().next());
    }

    List<Double> doubleInterval = Interval.stream().map(e->e.doubleValue()).toList();
    boolean nr = doubleInterval.stream().anyMatch(e->e==12);
    if(nr){
       while(!doubleInterval.isEmpty()){
           System.out.print(doubleInterval.iterator().next()+" ");
       }
       System.out.println();
    }
    }
}