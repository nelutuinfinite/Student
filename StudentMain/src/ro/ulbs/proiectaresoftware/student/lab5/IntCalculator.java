package ro.ulbs.proiectaresoftware.student.lab5;

public class IntCalculator {
    int state;
    IntCalculator(int number){
        state=number;
    }
    public IntCalculator add(int number){
        this.state+=number;
        return this;
    }public IntCalculator substract(int number){
        this.state-=number;
        return this;
    }public IntCalculator multiply(int number){
        this.state*=number;
        return this;
    }
    public int result(){
        return state;
    }
    public IntCalculator clear(){
        state=0;
        return this;
    }
    public IntCalculator bulid(){
        return new IntCalculator(state);
    }

}
