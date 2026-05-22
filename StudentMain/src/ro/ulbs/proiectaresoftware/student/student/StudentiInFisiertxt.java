package ro.ulbs.proiectaresoftware.student.student;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;

public class StudentiInFisiertxt implements IStudentiExport{
    private String numeFisier = "C:\\Users\\nelut\\IdeaProjects\\Student\\StudentMain\\src\\ro\\ulbs\\proiectaresoftware\\student\\student\\StudentiInFisiertxt.java";


    @Override
    public void AfisareStudeti(List<Student> Clasa)  {
        try(FileWriter numeFisier= new FileWriter("C:\\Users\\nelut\\IdeaProjects\\Student\\StudentMain\\src\\ro\\ulbs\\proiectaresoftware\\student\\student\\StudentiInFisiertxt.java")) {
        PrintWriter Fisier = new PrintWriter(numeFisier);
        for(final Student student:Clasa){
            Fisier.println(student.toString());
        }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;


    }
}
