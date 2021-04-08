import java.util.Scanner;

public class iteratif {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int faktorial = 1;
        System.out.print("Masukan nilai: ");
        int nilai = input.nextInt();
        for (int i = nilai; i >= 1; i--) {
            faktorial = i*faktorial;
        }
        System.out.println("Nilai faktorial " + nilai + " = " + faktorial);
    }
   
}