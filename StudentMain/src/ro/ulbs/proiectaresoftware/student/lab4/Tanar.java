package ro.ulbs.proiectaresoftware.student.lab4;

public class Tanar {
    private String name;
    private int age;
    private String address;

    public Tanar(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void Afis(){
        System.out.println(name+" "+age+" "+address);
    }
}
