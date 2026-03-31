package ro.ulbs.proiectaresoftware.student.lab5.Advanced;

public class Lab5Adv {
    public static void main(){
    NewInitCalculator numar= new NewInitCalculator();
        numar.init(10);
        Integer rez=(Integer)(numar.Add(5).substract(3).multiply(2).results());
    System.out.println(rez);
    DoubleClaculator num= new DoubleClaculator();
    num.init(10.0);
    Double rezultat= (Double)(num.add(5.0).substract(3.3).multiply(2.2).results());
    System.out.println(rezultat);
    }
}
