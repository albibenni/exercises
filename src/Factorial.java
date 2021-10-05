//Scrivere un programma che dato un numero, restituisca il suo fattoriale
public class Factorial {
    public Factorial(){
    }

    public static int countFactorial(int numberToFactor){
        if (numberToFactor<=1)
            return 1;
        else
            return numberToFactor * countFactorial(numberToFactor-1);
    }


    public static void main(String[] args){
        System.out.println(Factorial.countFactorial(3));
    }
}
