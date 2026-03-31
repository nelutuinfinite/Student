package ro.ulbs.proiectaresoftware.student.lab5.Advanced;

public class DoubleClaculator extends ACalculator
{


    @Override
    public DoubleClaculator init(Object num) {
        state=(Double)num;
        return this;
    }
    public DoubleClaculator add(Double number){
        state=(Double)state+number;

        return this;
    }
    public DoubleClaculator substract(Double number){
        state=(Double)state-number;
        return this;
    }

    public DoubleClaculator multiply(Double state) {
        this.state=(Double)this.state*state;
        return this;
    }
}
