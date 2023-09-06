package Prioritas2;
class LoopingXYZ {
    public static void main(String[] args) {
        drawXYZ(5);
    }

    public static void drawXYZ(int height) {
        System.out.println("##  Tugas QE Prioritas 2 Soal 1  ##");
        System.out.println("=========================================");
        System.out.println();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == j) {
                    System.out.print("x");
                } else if ((i + j) % 2 == 0) {
                    System.out.print("z");
                } else {
                    System.out.print("y");
                }
            }
            System.out.println();
        }
    }
}