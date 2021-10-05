package Operazioni;

public class MainOperzioni {



    public static void main(String[] args){
        //old
        Addizione addizione = new Addizione();
        Divisione divisione = new Divisione();
        Moltiplicazione moltiplicazione = new Moltiplicazione();

        addizione.makeOp(10,12);
        divisione.makeOp(10,12);
        moltiplicazione.makeOp(10,12);

        //new



        OperazioniMath sum = Double::sum;
        OperazioniMath diff = (a,b) -> a-b;
        OperazioniMath div = (a,b) -> a/b;
        OperazioniMath mul = (a,b) -> a*b;

        System.out.println("Diff: " + diff.operazione(10, 10));
        System.out.println("Somma: " + sum.operazione(10, 10));
        System.out.println("Div: " + div.operazione(10, 10));
        System.out.println("Mult: " + mul.operazione(10, 10));

        //other

        Opera moltiplica = (x, y)-> System.out.println( x * y);
        Opera dividi = (x,y)-> System.out.println( x / y);
        Opera somma = (x,y)-> System.out.println( x + y);
        Opera sottrai = (x,y)-> System.out.println( x - y);

        moltiplica.operzione(10,10);
        dividi.operzione(10,10);
        somma.operzione(10,10);
        sottrai.operzione(10,10);



    }

    interface OperazioniMath {
        double operazione (double o1, double o2);
    }
}
