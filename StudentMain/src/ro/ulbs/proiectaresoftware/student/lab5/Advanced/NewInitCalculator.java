package ro.ulbs.proiectaresoftware.student.lab5.Advanced;

public class NewInitCalculator extends ACalculator{

    public ACalculator init(Object num){
        state=(Integer)num;
        return this;
    }
    public NewInitCalculator Add(Integer number){
        state=(Integer)state+number;
        return this;
    }
    NewInitCalculator substract(Integer number){
        state=(Integer)state-number;
        return this;
    }
    public NewInitCalculator multiply(Integer number){
        state=(Integer)state*number;
        return this;
    }
}
