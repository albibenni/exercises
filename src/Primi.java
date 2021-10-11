//Calcola i numeri primi compresi tra due numeri interi inseriti dall'utente.

import java.util.ArrayList;

public class Primi extends Divisori{
    private final int numberOne;
    private final int numberTwo;

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    private final ArrayList<Integer> arrayList = new ArrayList<>();

    public Primi (int numberOne, int numberTwo){
        super();
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }


    protected void getPrimeNumbers (){
        int numberCount = 0, numberRange = 0;
        //chosing which one is the range and the starting number (startingN>range)
        if(numberTwo>numberOne) {
            numberCount = numberTwo;
            numberRange = numberOne;
            isItPrime(numberCount, numberRange);
        }else if(numberTwo<numberOne){
            numberCount = numberOne;
            numberRange = numberTwo;
            isItPrime(numberCount, numberRange);
        } else {
            System.err.println("Can't calculate primes between two equal numbers");
        }
//       iteration until count = range

    }
    private void isItPrime(int numberCount, int numberRange){
        if(numberCount<2){
            arrayList.add(1);
        } else {
            while (numberCount > numberRange) {
                setNumber(numberCount);
                if (getDivisori().size() == 2 || getDivisori().size() == 1) {
                    arrayList.add(numberCount);
                }
                --numberCount;
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int number = 10;
        int range = 1;
        Primi primi = new Primi(number, range);
        primi.getPrimeNumbers();
        ArrayList<Integer> arrayList = primi.getArrayList();
        System.out.println("Tra " + number + " e " + range + " vi sono: ");
//        for (Integer n : arrayList) {
//            System.out.println(n);
//        }
        arrayList.parallelStream().forEach(el ->{
            System.out.println(el);
        });

        //guardare reference methods
//        arrayList.parallelStream().forEach(System.out::println);

        int sum = arrayList.stream()
                .mapToInt(Integer::intValue)
//                .mapToInt(el -> el)
//                .filter(el -> el%2==0)
                .sum();

        System.out.println("somma dei primi:  " + sum);

//
//        arrayList.stream().forEach(el->{
//            System.out.println(el);
//        });
//
//        arrayList.parallelStream().forEach(integer -> {
//            System.out.println(i);
//        });
    }
}
