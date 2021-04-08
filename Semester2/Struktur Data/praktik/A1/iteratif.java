import java.util.Scanner;

public class iteratif {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Input jumlah kepingan : ");
		int n = input.nextInt();
		hanoi(n);
	}

	public static void hanoi(int n) {
		System.out.println("");
		for(int x = 1; x < 1 << n; x++) {
		    System.out.println("Langkah "+x);
			System.out.println("Pindahkan piringan dari " + ((x & x - 1) % n + 1) + " ke " + (((x | x - 1) + 1) % n + 1));
		}
	}
}