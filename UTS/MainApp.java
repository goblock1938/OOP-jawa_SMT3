package UTS;

public class MainApp {
  public static void main(String[] args) {
    Penulis penulis1 = new Penulis("Eko Kurniawan");
    Penulis penulis2 = new Penulis("Rinaldi Munir");
    Penerbit penerbit1 = new Penerbit("Media Kita");
    Penerbit penerbit2 = new Penerbit("Informatika");

    Buku[] katalog = {
        new Buku("B001", "Pemrograman Berbasis Objek Java", penulis1, penerbit1, 5, 120000),
        new Buku("B002", "Struktur Data & Algoritma", penulis2, penerbit2, 3, 95000)
    };
    Anggota anggota = new Anggota("M001", "Dharil Fi'al", "Surabaya");
    Petugas petugas = new Petugas("P99", "Siti Aminah");

    Peminjaman peminjaman = new Peminjaman("TRX-01", anggota, petugas, katalog[1], 7);
    Transaksi[] transaksi = {
        peminjaman,
        new Pengembalian("TRX-02", peminjaman, petugas),
        new Pesanan("TRX-03", anggota, petugas, katalog[0], 2, "QRIS")
    };

    System.out.println("=== KATALOG BADWOLF STORE ===");
    for (Buku buku : katalog) {
      buku.tampilkanInfo();
    }
    for (Transaksi item : transaksi) {
      item.prosesTransaksi();
    }
    System.out.println("\n=== STOK AKHIR ===");
    for (Buku buku : katalog) {
      buku.tampilkanInfo();
    }
  }
}
