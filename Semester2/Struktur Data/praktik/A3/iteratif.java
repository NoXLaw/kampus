import java.util.Scanner;

public class iteratif {
    
    static void fibo(int deret) {
        int x=0, y=1, z=0;
        for(int i=0; i<deret; i++) {
            if(i==0)
                System.out.println("fibonacci ke-"+ i +" : "+x);
            else if(i==1)
                System.out.println("fibonacci ke-"+ i +" : "+y);
            else{
                z=x+y;
                System.out.println("fibonacci ke-"+ i +" : "+z);
                x=y;
                y=z;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nama  : Azka Ainul Maarij");
        System.out.println("NIM   : G.131.20.0075");
        System.out.println("Kelas : A3");
        System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
        int deret = scan.nextInt();
        fibo(deret);
    }
}