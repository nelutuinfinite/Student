package ro.ulbs.proiectaresoftware.student;

public class Aplication {
    public static void main(){
        Student s1 = new Student(211,"Popa","Maria","21/1");
        Student s2 = new Student(145,"Ban","Ion","21/1");
        Student s3 = new Student(211,"Sufana","Cristi","22/1");
        Student s4 = new Student(211,"Radu","Ioana","21/2");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
    }

}
