import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("PILIHAN : ");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Kerucut");
        System.out.println("3. Hitung Limas Segitiga");
        System.out.print("Pilih :");
        
       Scanner input = new Scanner(System.in);
       int pilih = input.nextInt();
       
       switch(pilih)
       {
           case 1 :
               Hitung balok = new Hitung();
               Hitung.HitungBalok();
              break;
              
           case 2 : 
                Hitung limas = new Hitung();
                Hitung.HitungLimas();
              break;
              
           case 3 : 
                Hitung kerucut = new Hitung();
                Hitung.HitungKerucut();
           break;
       }
     
    }
    
}
