package Prioritas1;
import java.util.Scanner;
    
class UntungRugi {
  public static void main(String args[]) 
    {   
        System.out.println("##  Tugas QE Prioritas 1 Soal 2  ##");
        System.out.println("=========================================");
        System.out.println();
	
        Scanner untungrugi= new Scanner(System.in);
        System.out.print("Masukkan Harga beli: ");
        double hb=untungrugi.nextDouble();
		System.out.print("Masukkan Harga jual: ");
         	double hj=untungrugi.nextDouble();
 
		if(hb-hj>0)
                {
		  System.out.println("Output: rugi sebesar " +(hb-hj));
		}
		else if(hb-hj<0)
                {
		  System.out.println("Output: untung sebesar " +(hj-hb));
		}
		else
		
		  System.out.println("Output: sama aja");
          
   }
}
