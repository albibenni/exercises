
//Inserire una serie di numeri interi positivi da tastiera ed individuare il massimo e il minimo;
// la serie in ingresso deve essere terminata dal numero 0.

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxMin {
    private final List<Integer> list;

    public List<Integer> getList() {
        return list;
    }

    public MaxMin(List<Integer>list){
        this.list = autoSort(list);
    }

    private List<Integer> autoSort(List<Integer>list){
        return list.stream()
                    .sorted()
                    .collect(Collectors.toList());
    }

    private void findMax(){
//        max = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (max<list.get(i)) max = list.get(i);
//        }
        list.stream()
                .max(Comparator.comparing(Integer::byteValue))
                .ifPresent((el) -> System.out.println("MAX: " + el));
    }

    private void findMin(){
//        min = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (min>list.get(i)) min = list.get(i);
//        }
        list.stream()
                .min(Comparator.comparing(Integer::byteValue))
                .ifPresent((el) -> System.out.println("MIN: " + el));
    }

    static Function<Integer, Integer> increment = number -> number+1;

    static BiFunction<Integer, Integer, Integer> doubleIncrement = (n1, n2) -> n1 + increment.apply(n2);

    public static void main(String[] args) {
//        List<Integer> list = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(ThreadLocalRandom.current().nextInt(0, 100));
//        }



        int sumOne = increment.apply(1);
        int sumBiF = doubleIncrement.apply(sumOne, sumOne);

        System.out.println(sumOne);
        System.out.println(sumBiF);



//        MaxMin maxMin = new MaxMin(list);
//        maxMin.findMin();
//        maxMin.findMax();

//        List<Integer> sortedL = list.stream()
//                .sorted()
//                .collect(Collectors.toList());
//
//        sortedL.forEach(System.out::println);
//
//        //max
//        System.out.println("MAX: ");
//        sortedL.stream()
//                .max(Comparator.comparing(Integer::byteValue))
//                .ifPresent(System.out::println);
//
//        //min
//        System.out.println("MIN: ");
//        sortedL.stream()
//                .min(Comparator.comparing(Integer::byteValue))
//                .ifPresent(System.out::println);

//        MaxMin maxMin = new MaxMin(list);
//        maxMin.findMax();
//        maxMin.findMin();
//        System.out.println(list);
//        System.out.println("MAX: " + maxMin.getMax());
//        System.out.println("MIN: " + maxMin.getMin());
    }
}
