package Moneta;

import java.util.concurrent.ThreadLocalRandom;

public class Moneta extends Launch{
    @Override
    public void launch() {
        setResult(ThreadLocalRandom.current().nextInt(1, 3));
        if (super.getResult()==1)
            System.out.println("testa");
        else System.out.println("croce");
    }
}
