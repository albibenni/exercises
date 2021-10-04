package Moneta;

import java.util.concurrent.ThreadLocalRandom;

public class Dado extends Launch{
    @Override
    public void launch() {
        setResult(ThreadLocalRandom.current().nextInt(1, 9));
        System.out.println(super.getResult());
    }
}
