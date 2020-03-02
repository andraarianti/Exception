
import java.util.InputMismatchException;
import java.util.Scanner;


public class Hitung {
    
    Scanner syarat = new Scanner(System.in);
    
    public static void HitungBalok(){
        double vol_b, lp_b;    
        
        Scanner hitung = new Scanner(System.in);
            try{
                System.out.println("VOLUME & LUAS PERMUKAAN BALOK");
                
                System.out.print("Panjang : ");
                int p = hitung.nextInt();
                System.out.print("Lebar : ");
                int l = hitung.nextInt();
                System.out.print("Tinggi : ");
                int t = hitung.nextInt();

                vol_b = p*l*t;
                lp_b = (2*p*l)+(2*l*t)+(2*l*t);
                
                System.out.println("Volume = " + vol_b);
                System.out.println("Luas Permukaan = " + lp_b);
            }
            catch(InputMismatchException e){
                System.out.println("");
                System.out.println(e);
                System.out.println("ERROR, Harus Integer");
            }
        }
    
    
        public static void HitungLimas(){
        double vol_l, lp_l;
        
        Scanner hitung = new Scanner(System.in);
            try{
                System.out.println("VOLUME & LUAS PERMUKAAN LIMAS SEGITIGA ");

                    System.out.print("Panjang : ");
                    int p = hitung.nextInt();
                    System.out.print("Lebar : ");
                    int l = hitung.nextInt();
                    System.out.print("Tinggi : ");
                    int t = hitung.nextInt();

                    vol_l = 1/2 * (p * l) *4;
                    lp_l = 1/3 * (1/2 * p * l) * t;

                    System.out.println("Volume = " + vol_l);
                    System.out.println("Luas Permukaan = " + lp_l);
            }
            catch(IllegalArgumentException e){
                System.out.println("");
                System.out.println(e);
                System.out.println("ERROR, Harus INT");
            }
        }
 
        public static void HitungKerucut(){
            double vol_k, lp_k, pi=3.14;
            
            Scanner hitung = new Scanner(System.in);
            try{
                System.out.println("VOLUME & LUAS PERMUKAAN LIMAS SEGITIGA ");

                    System.out.print("Jari-jari : ");
                    double r = hitung.nextDouble();
                    System.out.print("Tinggi : ");
                    double t = hitung.nextDouble();
                    System.out.print("Garis Pelukis : ");
                    double s = hitung.nextDouble();

                    vol_k = 1/3 * (pi*r*r) * t;
                    lp_k = (pi*r*r) + (pi*r*s);
                            
                    System.out.println("Volume = " + vol_k);
                    System.out.println("Luas Permukaan = " + lp_k);
            }
            catch(Exception e){
                System.out.println("");
                System.out.println(e);
                System.out.println("ERROR");
            }
        }
}
