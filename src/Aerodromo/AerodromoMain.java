package Aerodromo;

public class AerodromoMain {

    public static void main(String[] args){

        Aereo aereo = new Aereo("abab", 10000);
        Aliante aliante = new Aliante("cabb", 2);
        Aereo aereo2 = new Aereo("abab", 11000);
        Aliante aliante2 = new Aliante("cabb", 1);



        System.out.println(aereo.getSigla() + "  " + aereo.getCV());
        System.out.println(aereo.compareTo(aereo2));

        System.out.println(aliante.getSigla() + "  " + aliante.getEfficiency());
        System.out.println(aliante.compareTo(aliante2));

        System.out.println(aliante2.superior(aliante));

    }
}
