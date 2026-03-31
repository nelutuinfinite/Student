package ro.ulbs.proiectaresoftware.student.lab5.Advanced;

public abstract class ACalculator {
    Object state;
    public Object results(){
        return state;
    }
    public ACalculator clear(){
        state=null;
        return this;
    }
    public abstract ACalculator init(Object num);
}
