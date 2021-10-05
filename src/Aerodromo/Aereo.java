package Aerodromo;

import java.util.Comparator;

public class Aereo extends Aeromobile implements Comparable<Aereo>  {
    public Aereo(String sigla, int CV){
        super();
        super.setSigla(sigla);
        this.CV = CV;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }
    public void setDetails(String sigla, int CV) {
        super.setSigla(sigla);
        this.CV = CV;
    }

    private int CV;

    @Override
    public String toSting(){
        return "Aliante sigla: " + getSigla() + " efficienza:" + String.valueOf(CV);
    }
    @Override
    public int compareTo(Aereo other) {
        if (this.CV > other.CV) return 1;
        else if (this.CV < other.CV) return -1;
        return 0;
    }

    @Override
    public boolean superior(Aeromobile other) {
        return (other instanceof Aereo && this.compareTo((Aereo) other) > 0);
    }
}
