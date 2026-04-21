package ro.ulbs.proiectaresoftware.student.student;

import java.util.Objects;

public class Student {
    private int numarMaricol;
   private String nume, prenume, grupa;

    public Student(int numarMaricol, String nume, String prenume, String grupa) {
        this.numarMaricol = numarMaricol;
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
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
}
