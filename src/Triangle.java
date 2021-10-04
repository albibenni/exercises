//Scrivere un programma che inseriti i lati di un ipotetico triangolo,
// dica se tale triangolo esiste.(un triangolo è fattibile se ogni lato è minore della somma degli altri due)


public class Triangle {
    private int l1,l2,l3;

    public Triangle(int l1, int l2, int l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;

    }

    public boolean exist(){
        int [] sides = {l1, l2, l3};
        boolean existence = true;
        for (int i = 0; i < sides.length; i++) {
            int index = (i+1)%(sides.length);
            int index2 = (index+1)%(sides.length);
            int result = sides[index] + sides[index2];
            if (result<sides[i]){
                existence = false;
                System.out.println("it doesnt exist");
                break;
            }
        }
        if(existence)
            System.out.println("it exists");
        return existence;
    }

    public static void main(String[] args){
        int l1 = 12, l2 = 3, l3 = 4;
        Triangle triangle = new Triangle(l1, l2, l3);
        triangle.exist();
    }
}
