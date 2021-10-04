package AreaTreD;

public class Cilinder extends Area3d{
    private final int radius, h;

    public Cilinder(int radius, int h){
        this.h = h;
        this.radius = radius;

    }
    @Override
    public void area() {
        setArea(2*(Math.PI*radius*radius)+(2*Math.PI*radius*h));
    }

    @Override
    public void volume() {
        setVolume(Math.PI*radius*radius*h);
    }
}
