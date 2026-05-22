package ro.ulbs.proiectaresoftware.student.student;

import java.util.List;

public class StudentiInConsola implements IStudentiExport{
    @Override
    public void AfisareStudeti(List<Student> Clasa) {
        for(final Student student : Clasa){
            System.out.print(student.toString());
        }
        System.out.print("\n");
    }
}
