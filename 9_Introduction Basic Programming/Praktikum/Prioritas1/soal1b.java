package Prioritas1;
import java.util.Scanner;
import java.util.Locale;
    
class LuasPersegiPanjang {
  public static void main(String args[]){
             
    Scanner persegipanjang = new Scanner(System.in).useLocale(Locale.US);
        
    System.out.println("##  Tugas QE Prioritas 1 Soal 1.b  ##");
    System.out.println("=========================================");
    System.out.println();
       
    double panjang, lebar, luas;
     
    System.out.print("Masukkan panjang:");
    panjang = persegipanjang.nextDouble();
     
    System.out.print("Masukkan lebar:");
    lebar = persegipanjang.nextDouble();
    
    luas = panjang * lebar;
    luas = Math.round(luas*100)/100.0;
        
    System.out.println("Luas persegi panjang: "+luas);
   
  }
}