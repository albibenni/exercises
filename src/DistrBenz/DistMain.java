package DistrBenz;

import AreaTreD.Cilinder;
import AreaTreD.ParallelepipedR;

import java.util.Comparator;
import java.util.Objects;

public class DistMain{


    public static void main(String[] args){
        Comparator<Distributore> comparator = new Comparator<Distributore>() {
            @Override
            public int compare(Distributore o1, Distributore o2) {
                return Double.compare(o1.getCapacita(), o2.getCapacita());
            }
        };

        DistMain distMain = new DistMain();
        Distributore distributore1 =
                new Distributore("Milano", "Paolo", 10000.0, 1000.0);
        Distributore distributore2 =
                new Distributore("Varese", "Paola", 20000.0, 15000.0);
        Distributore distributore3 =
                new Distributore("Bergamo", "Francesco", 20000.0, 12000.0);


//        System.out.println(distMain.compare(distributore2, distributore3));
//        System.out.println(distMain.compare(distributore2, distributore1));
//        System.out.println(distMain.compare(distributore1, distributore3));
//        distributore2.erogazione(10000.0);
//        System.out.println(distMain.compare(distributore2, distributore3));
//        System.out.println(distMain.compare(distributore2, distributore1));
//        System.out.println(distMain.compare(distributore1, distributore3));

        System.out.println(distributore2.getBenzContenuta());

//        System.out.println(distributore2.equals(distributore3));
//        System.out.println(distributore2.equals(distributore1));
//        System.out.println(distributore1.equals(distributore3));
//        distributore2.erogazione(10000.0);
//        System.out.println(distributore1.equals(distributore3));
//        System.out.println(distributore2.equals(distributore3));
//        System.out.println(distributore2.equals(distributore3));

    }

}
