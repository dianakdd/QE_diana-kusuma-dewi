class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Pembagian oleh nol tidak diizinkan.");
            return Double.NaN;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        System.out.println("##  Tugas QE Prioritas 2  ##");
        System.out.println("=========================================");
        System.out.println();

        int num1 = 3;
        int num2 = 4;
   
        int penjumlahan = add(num1, num2);
        System.out.println("Hasil Penjumlahan: " + penjumlahan);

        int pengurangan = subtract(15, 4);
        System.out.println("Hasil Pengurangan: " + pengurangan);

        int perkalian = multiply(10, 10);
        System.out.println("Hasil Perkalian: " + perkalian);

        double pembagian = divide(12, 3);
        System.out.println("Hasil Pembagian: " + pembagian);
    }
}
