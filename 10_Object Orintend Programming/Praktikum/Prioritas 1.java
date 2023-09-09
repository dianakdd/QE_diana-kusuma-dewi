import java.text.NumberFormat;
import java.util.Locale;

class Produk {
    private String nama;
    private String deskripsi;
    private double harga;
    private int stok;

    public Produk (String nama, String deskripsi, double harga, int stok) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }
    public static void main(String[] args) {
        System.out.println("##  Tugas QE Prioritas 1  ##");
        System.out.println("=========================================");
        System.out.println();

        Produk produk1 = new Produk("Coffee", "This is coffee", 15000, 10);
        Produk produk2 = new Produk("milk", "this is fresh milk", 25000, 10);
        Produk produk3 = new Produk("apple juice", "this is juice", 18000, 20);
        System.out.println("Informasi Produk 1:");
        produk1.getInfo();

        System.out.println("\nInformasi Produk 2:");
        produk2.getInfo();

        System.out.println("\nInformasi Produk 3:");
        produk3.getInfo();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }


    public void getInfo() {
        System.out.println("=====================");
        System.out.println("Nama: " + nama);
        System.out.println("Deskripsi: " + deskripsi);

        Locale locale = new Locale("id", "ID"); 
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(locale);
        String hargaRupiah = rupiahFormat.format(harga);

        System.out.println("Harga: " + hargaRupiah);
        System.out.println("Jumlah Stok: " + stok);

    }


}
