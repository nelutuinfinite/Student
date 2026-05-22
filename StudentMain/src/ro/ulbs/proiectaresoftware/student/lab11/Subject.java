package ro.ulbs.proiectaresoftware.student.lab11;

public interface Subject {
    public void addObserver(Observer Altul);
    public void removeObserver(Observer Altul);
    public void notifyObservers(String mesaj);
}
