package Operazioni;

interface Opera {
    void operzione (double o1, double o2);
}

public abstract class Operazioni {

    protected abstract void makeOp(double o1, double o2);

    protected void printAll(double number){
        System.out.println(number);
    }
}
