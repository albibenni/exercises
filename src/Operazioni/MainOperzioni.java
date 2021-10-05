package Operazioni;

public class MainOperzioni {



    public static void main(String[] args){
        Addizione addizione = new Addizione();
        Divisione divisione = new Divisione();
        Moltiplicazione moltiplicazione = new Moltiplicazione();

        addizione.makeOp(10,10);
        divisione.makeOp(10,10);
        moltiplicazione.makeOp(10,10);
    }
}
