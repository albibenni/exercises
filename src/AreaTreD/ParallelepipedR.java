package AreaTreD;

public class ParallelepipedR extends Area3d{
    private final double l1,l2,l3;
    public ParallelepipedR(double l1, double l2, double l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    @Override
    public void area() {
        super.setArea(2*(l1*l2+l1*l3+l2*l3));
    }

    @Override
    public void volume() {
        super.setVolume(l1*l2*l3);
    }
}
