package AreaTreD;

public class Main {

    public static void main(String[] args){
        Cilinder cilinder = new Cilinder(4,3);
        ParallelepipedR parallelepipedR = new ParallelepipedR(3,4,5);
        cilinder.area();
        cilinder.volume();
        cilinder.getArea();
        cilinder.getVolume();

        parallelepipedR.area();
        parallelepipedR.volume();
        parallelepipedR.getArea();
        parallelepipedR.getVolume();
    }
}
