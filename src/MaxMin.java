
//Inserire una serie di numeri interi positivi da tastiera ed individuare il massimo e il minimo; la serie in ingresso deve essere terminata dal numero 0.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class MaxMin {
    private LinkedList<Integer> list;

    public LinkedList<Integer> getList() {
        return list;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    private int max = 0, min = 0;
    public MaxMin(LinkedList<Integer>list){
        this.list = list;
    }

    private void findMax(){
        max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max<list.get(i)) max = list.get(i);
        }
    }

    private void findMin(){
        min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min>list.get(i)) min = list.get(i);
        }
    }


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(ThreadLocalRandom.current().nextInt(0, 100));
        }
        MaxMin maxMin = new MaxMin(list);
        maxMin.findMax();
        maxMin.findMin();
        System.out.println(list);
        System.out.println("MAX: " + maxMin.getMax());
        System.out.println("MIN: " + maxMin.getMin());
    }
}
