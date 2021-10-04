//Scrivere un programma che dato un numero, restituisca il suo fattoriale
public class Factorial {
    public Factorial(){
    }

    public int countFactorial(int n){
        if (n<=1)
            return 1;
        else
            return n * countFactorial(n-1);
    }


    public static void main(String[] args){
        System.out.println(new Factorial().countFactorial(3));
    }
}
