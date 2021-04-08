import java.util.Scanner;

public class rekursif {

  static int fibo(int deret){
    if(deret == 0 || deret == 1){                                       
      return deret;                                                     
    } else {                                                            
      return (fibo(deret-1) + fibo(deret-2));                           
    }
  }
  public static void main(String[]args){
      
    int i, j = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Nama  : Azka Ainul Maarij");
    System.out.println("NIM   : G.131.20.0075");
    System.out.println("Kelas : A3");
    System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
    int deret = scan.nextInt();

    System.out.print("Hasil bilangan fibonacci\n");
    for (i = 0; i < deret; i++){                                        
      System.out.println("fibonacci ke-"+ i +" : " + fibo(j) +" ");   
      j++;                                                              
    }
  }
}