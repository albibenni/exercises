package AreaTreD;

//Esercizio 7 Realizza un programma che sia in grado di valutare il volume di oggetti tridimensionali come cilindri
// e parallelepipedi basandosi sul valore della loro area e dell'altezza.
// Delegare i metodi comuni, come il calcolo e la stampa del volume ad una classe astratta.

public abstract class Area3d {
    private double area;
    private double volume;

    public void setArea(double area) {
        this.area = area;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    protected abstract void area();

    protected abstract void volume();

    public void getArea() {
        System.out.println(area);
    }

    public void getVolume() {
        System.out.println(volume);
    }
}
