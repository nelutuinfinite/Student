package ro.ulbs.proiectaresoftware.student;

import ro.ulbs.proiectaresoftware.student.student.Student;
import ro.ulbs.proiectaresoftware.student.student.StudentiBursieri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aplication {
    public static void main(){
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


        List<Student> studentiCuNote = Arrays.asList(
                new Student(1025,"Andrei","Popa","ISM141/2", 8.70),
                new Student(1024,"Ioan","Mihalcea","ISM141/1", 10),
                new Student(1026,"Anamaria","Prodan","TI131/1", 8.90),
                new Student(1029,"Bianca","Popescu","TI131/1,", 10),
                new Student(1029,"Maria","Pana","TI131/2,", 4.10),
                new Student(1029,"Gabriela","Mohanu","TI131/2,", 7.33),
                new Student(1029,"Marius","Nasta","TI131/2,", 3.20),
                new Student(1029,"Marius","Nasta","TI131/1,", 5.12),
                new Student(1029,"Andrei","Dobrescu","TI131/2,", 2.22)
        );
        List<Student> StudentiNota10 = studentiCuNote.stream().filter(e->e.getNote()==10).toList();
        List<Student> StudentiNotaSub5= studentiCuNote.stream().filter(e->e.getNote()<5).toList();


        //4.5.2
        Map<Integer, Student> mapaStudenti = new HashMap<>();
        String fisierStudenti = "C:\\Users\\nelut\\IdeaProjects\\Student\\StudentMain\\src\\ro\\ulbs\\proiectaresoftware\\student\\student\\CitireStudent.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fisierStudenti))) {
            String linie;
            while ((linie = br.readLine()) != null) {
                if (linie.trim().isEmpty()) continue; // Sarim peste liniile goale

                String[] parti = linie.split(",");
                if (parti.length >= 4) {
                    int nrMatricol = Integer.parseInt(parti[0].trim());
                    String nume = parti[1].trim();
                    String prenume = parti[2].trim();
                    String grupa = parti[3].trim();
                    Student student = new Student(nrMatricol, nume, prenume, grupa);
                    mapaStudenti.put(nrMatricol, student);
                }
            }

        } catch (IOException e) {
           throw new RuntimeException(e);
        }


        String fisierNote = "C:\\Users\\nelut\\IdeaProjects\\Student\\StudentMain\\src\\ro\\ulbs\\proiectaresoftware\\student\\student\\note_anon.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fisierNote))) {
            String linie;
            while ((linie = br.readLine()) != null) {
                if (linie.trim().isEmpty()) continue;

                String[] parti = linie.split(",");
                if (parti.length == 2) {
                    String nrMatricol = parti[0].trim();
                    double nota = Double.parseDouble(parti[1].trim());
                    Student student = mapaStudenti.get(nrMatricol);

                    if (student != null) {
                        student.setNote(nota);
                    }
                }
            }

        } catch (IOException e) {
           throw new RuntimeException(e);
        }
        for (Student s : mapaStudenti.values()) {
            System.out.println(s);
        }
    }


    List<Student> studentiCuNote = Arrays.asList(
            new Student(1025,"Andrei","Popa","ISM141/2", 8.70),
            new Student(1024,"Ioan","Mihalcea","ISM141/1", 10),
            new Student(1026,"Anamaria","Prodan","TI131/1", 8.90),
            new Student(1029,"Bianca","Popescu","TI131/1,", 10),
            new Student(1029,"Maria","Pana","TI131/2,", 4.10),
            new Student(1029,"Gabriela","Mohanu","TI131/2,", 7.33),
            new Student(1029,"Marius","Nasta","TI131/2,", 3.20),
            new Student(1029,"Marius","Nasta","TI131/1,", 5.12),
            new Student(1029,"Andrei","Dobrescu","TI131/2,", 2.22)
    );
 List<Student> StudentiNota10 = studentiCuNote.stream().filter(e->e.getNote()==10).toList();
 List<Student> StudentiNotaSub5= studentiCuNote.stream().filter(e->e.getNote()<5).toList();

}





