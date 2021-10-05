package Aerodromo;

import java.util.Comparator;

public class Aliante extends Aeromobile implements Comparable<Aliante>{

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
        if (this.efficiency < other.efficiency) return 1;
        else if (this.efficiency > other.efficiency) return -1;
        return 0;
    }

    @Override
    public String toSting(){
        return "Aliante sigla: " + getSigla() + " efficienza:" + String.valueOf(efficiency);
    }

    @Override
    public boolean superior(Aeromobile other) {
        return (other instanceof Aliante && this.compareTo((Aliante) other) > 0);
    }
}
