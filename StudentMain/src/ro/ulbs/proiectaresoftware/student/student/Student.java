package ro.ulbs.proiectaresoftware.student.student;

import java.util.*;

public class Student {
    private final int numarMaricol;
   private final String nume, prenume, grupa;
   private double note;


    public Student(int numarMaricol, String nume, String prenume, String grupa) {
        this.numarMaricol = numarMaricol;
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
    }
    public Student(int numarMaricol, String nume, String prenume, String grupa,double note) {
        this.numarMaricol = numarMaricol;
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note=note;
    }
    public void Exsita(Student a){

    }

    public int getNumarMaricol() {
        return numarMaricol;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setNote(double note){this.note=note;}

    public double getNote() {
        return note;
    }

    @Override
    public String toString() {
         return String.format("%8d %8s %8s %s", numarMaricol,nume,prenume,grupa);

    }

    public boolean equals(Student obj) {
        int primulStudent=this.getNumarMaricol();
        int alDoileStudent= obj.getNumarMaricol();
        if(primulStudent==alDoileStudent) return true;
        else return false;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numarMaricol == student.numarMaricol && Objects.equals(nume, student.nume) && Objects.equals(prenume, student.prenume) && Objects.equals(grupa, student.grupa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numarMaricol, nume, prenume, grupa);
    }

    public static List<Set<Student>> imparteInDouaFormtii(Set<Student> studenti){
        Set <Student> Temp= studenti;
         int mijloc= (studenti.size()+1)/2;
         Set <Student> Formatie1 = new HashSet<>();
         Set <Student> Formatie2 = new HashSet<>();
        for(int i=0;i< studenti.size();i++){
            while(!Temp.isEmpty()) {
                if (i < mijloc) {
                    Formatie1.add(Temp.iterator().next());
                }
                else {
                    Formatie1.add(Temp.iterator().next());
                }
            }
        }
        while (!Formatie1.isEmpty()){
            System.out.print(Formatie1.iterator().next()+" ");
        }
        System.out.println();
        while(!Formatie2.isEmpty()){
            System.out.print(Formatie2.iterator().next()+" ");

        }
        System.out.println();
        return Arrays.asList(Formatie1,Formatie2);

    }
    public static void mutaStudent(Student student, Set<Student> Sursa, Set<Student> destiantie){
        if (Sursa.remove(student)){
            destiantie.add(student);
        }
        else
            System.out.println("Nu exista "+student.getNume()+" in acest set");
    }
}
