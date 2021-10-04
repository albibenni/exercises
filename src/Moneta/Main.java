package Moneta;
//Esercizio 8 Scrivi un programma che simuli il lancio di un dado e di una moneta stampandone il risultato;
//con e senza l'utilizzo di una classe astratta che rappresenti i comportamenti comuni degli oggetti dado e moneta istanziati.

import AreaTreD.Cilinder;
import AreaTreD.ParallelepipedR;

public class Main {

    public static void main(String[] args){
        Moneta moneta = new Moneta();
        Dado dado = new Dado();
        moneta.launch();
        dado.launch();
    }
}
