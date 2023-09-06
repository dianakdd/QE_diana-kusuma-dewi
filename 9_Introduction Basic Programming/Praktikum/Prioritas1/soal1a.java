package Prioritas1;
import java.util.Scanner;
import java.util.Locale;
  
class LuasSegitiga {
  public static void main(String args[]){
           
    Scanner segitiga = new Scanner(System.in).useLocale(Locale.US);
      
    System.out.println("##  Tugas QE Prioritas 1 Soal 1.a  ##");
    System.out.println("=============================================");
    System.out.println();
     
    double a,t, luas;
 
    System.out.print("Masukkan alas: ");
    a = segitiga.nextDouble();
      
    System.out.print("Masukkan tinggi: ");
    t = segitiga.nextDouble();
  
    luas = 0.5 * a * t;
      
    System.out.println("Luas segitiga: "+luas);
 
  }
}