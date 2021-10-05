package Aerodromo;

public class AerodromoMain {

    public static void main(String[] args){

        Aereo aereo = new Aereo("abab", 10000);
        Aliante aliante = new Aliante("cabb", 2);

        System.out.println(aereo.getSigla() + "  " + aereo.getCV());
        System.out.println(aliante.getSigla() + "  " + aliante.getEfficiency());

    }
}
