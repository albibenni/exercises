//La serie di Fibonacci è una successione di interi in cui
// i primi 2 elementi sono 1 e tutti i successivi sono uguali alla somma dei due termini precedenti.
//Implementare un progetto che, tramite ricorsività e un numero in input definito dall'utente da console (utilizzare lo Scanner),
// stampi la relativa serie di Fibonacci.
//
// Esercizio Scrivere il programma del fattoriale con un metodo ricorsivo.


import java.util.Scanner;

public class Fib {
    public Fib(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number:");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    public int fib(int n){
        if (n<=2) return 1;
        else return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args){
        new Fib();
    }
}
