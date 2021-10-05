package Aerodromo;

import java.util.Comparator;

public class Aereo extends Aeromobile implements Comparator<Aereo>  {
    public Aereo(String sigla, int CV){
        super();
        setSigla(sigla);
        this.CV = CV;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    private int CV;

    @Override
    public int compare(Aereo o1, Aereo o2) {
        return 0;
    }
}
