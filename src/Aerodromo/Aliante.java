package Aerodromo;

import java.util.Comparator;

public class Aliante extends Aeromobile implements Comparable<Aereo> {

    public Aliante(String sigla, int efficiency){
        super();
        setSigla(sigla);
        this.efficiency = efficiency;
    }
    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    private int efficiency;


    @Override
    public int compareTo(Aliante other) {
        return this.compareTo(other);
    }
}
