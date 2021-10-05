import java.util.ArrayList;
import java.util.List;

//Scrivere un programma che richiesto un numero intero visualizzi tutti i suoi divisori, contandoli.

public class Divisori {

    public Divisori() {

    }

	public void setNumber(int number) {
		this.number = number;
	}

	private int number;


	public Divisori(int number) {
		this.number = number;
	}

	protected List<Integer> getDivisori() {
		int numberCount = number-1;
		List<Integer> list = new ArrayList<>();
		if (number>0) {
			list.add(number);
			while (numberCount > 0) {
				if (number % numberCount == 0) {
					list.add(numberCount);
				}
				numberCount--;
			}
		}else System.err.println("system out of scale");
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 5;
		Divisori divisori = new Divisori(number);
		List<Integer> list = divisori.getDivisori();

		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
