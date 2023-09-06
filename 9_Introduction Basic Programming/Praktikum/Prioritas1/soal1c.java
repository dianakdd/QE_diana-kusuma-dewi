package Prioritas1;
import java.util.Scanner;
import java.util.Locale;
    
class Lingkaran {
  public static void main(String args[]){
             
    Scanner lingkaran = new Scanner(System.in).useLocale(Locale.US);
        
    System.out.println("##  Tugas QE Prioritas 1 Soal 1.c  ##");
    System.out.println("=========================================");
    System.out.println();
       
    double r, luas;
  
    System.out.print("Masukkan jari-jari: ");
    r = lingkaran.nextDouble();
   
    luas = 3.14 * r * r;
       
    System.out.println("Luas lingkaran: "+luas);
   
  }
}