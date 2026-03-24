package ro.ulbs.proiectaresoftware.student.student;

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

}
