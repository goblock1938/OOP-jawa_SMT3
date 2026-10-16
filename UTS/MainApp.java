package UTS;

public class MainApp {
  public static void main(String[] args) {
    System.out.println("==================================================");
    System.out.println("     SISTEM MANAJEMEN BADWOLF STORE & LIBRARY     ");
    System.out.println("==================================================");

    // Inisialisasi Data Buku menggunakan Array of Objects
    Buku[] daftarBuku = {
        new Buku("B001", "Pemrograman Berbasis Objek Java", "Eko Kurniawan", "Media Kita", 5, 120000),
        new Buku("B002", "Struktur Data & Algoritma", "Rinaldi Munir", "Informatika", 3, 95000),
        new Buku("B003", "Clean Code in Action", "Robert C. Martin", "Prentice Hall", 2, 250000)
    };

    System.out.println("\n--- KATALOG KATALOG BUKU BADWOLF STORE ---");
    for (Buku b : daftarBuku) {
      b.tampilkanInfoBuku();
    }

    // Inisialisasi Data Anggota dan Petugas
    Anggota anggota1 = new Anggota("M001", "Dharil Fi'al", "Keputih, Surabaya");
    Petugas petugas1 = new Petugas("P99", "Siti Aminah");

    // Demonstrasi Alur Bisnis menggunakan Polymorphism (Array of Transaksi)
    // Array bertipe Superclass (Transaksi) menampung objek Subclass (Peminjaman &
    // Pesanan)
    Transaksi[] daftarTransaksi = new Transaksi[2];

    // Transaksi 1: Peminjaman Buku Perpustakaan (Meminjam Buku B002)
    daftarTransaksi[0] = new Peminjaman("TRX-01", anggota1, petugas1, daftarBuku[1], 7);

    // Transaksi 2: Pesanan/Pembelian Buku Toko (Membeli 2 pcs Buku B001)
    daftarTransaksi[1] = new Pesanan("TRX-02", anggota1, petugas1, daftarBuku[0], 2);

    // Menjalankan proses transaksi secara polimorfik
    for (Transaksi trx : daftarTransaksi) {
      trx.prosesTransaksi();
    }

    System.out.println("\n--- CEK SISA STOK BUKU SETELAH TRANSAKSI ---");
    for (Buku b : daftarBuku) {
      b.tampilkanInfoBuku();
    }
    System.out.println("==================================================");
  }
}
