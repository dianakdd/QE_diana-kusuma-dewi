package Prioritas2;
    
class SegitigaBintang {
  public static void main(String[] args) {
        System.out.println("##  Tugas QE Prioritas 2 Soal 2  ##");
        System.out.println("=========================================");
        System.out.println();

       int x = 5;
       for (int i = 1; i <= x; i++){
           for (int j = 4; j >= i; j--) {
               System.out.print(' ');
           }
           for (int k = 1; k <= i; k++){
               System.out.print('*');
           }
           for (int l = 1; l <= i - 1; l++){
               System.out.print('*');
           }
           System.out.println();
       }
}
}
