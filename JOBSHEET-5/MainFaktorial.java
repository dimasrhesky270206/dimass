import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        System.out.print("Masukkan nilai: ");
         int nilai = input.nextInt();

         BruteForceDivine fk = new BruteForceDivine();
         System.out.println("Nilai faktorial " + nilai + 
           " menggunakan BF: " + fk.FaktorialBF(nilai));
         System.out.println("Nilai faktorial " + nilai + 
         " menggunakan DC: " + fk.FaktorialDC(nilai));
        
     }
}
    

