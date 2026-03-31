package ro.ulbs.proiectaresoftware.student.lab5;

import java.lang.classfile.Superclass;


public class AdvancedCalculator extends IntCalculator{
    public AdvancedCalculator(int number){
        super(number);
    }
    public AdvancedCalculator Impartire(int number){
        state/=number;
        return this;
    }
    public AdvancedCalculator ridicareLaPutere(int Putere){
        if(Putere>1){
            for(int i=1;i<Putere;i++){
                state*=state;
            }
            return this;
        }
        if(Putere==1){
            return this;
        }
        if(Putere==0){
            state=1;
            return this;
        }
        return null;
    }
    public AdvancedCalculator radicalDeOrdinulN(int number){
        state = (int)(Math.pow(state, 1/number));
        return this;
    }
}
