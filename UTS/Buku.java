package UTS;

public class Buku {
  private String kodeBuku;
  private String judul;
  private String penulis;
  private String penerbit;
  private int stok;
  private double hargaJual;

  public Buku(String kodeBuku, String judul, String penulis, String penerbit, int stok, double hargaJual) {
    this.kodeBuku = kodeBuku;
    this.judul = judul;
    this.penulis = penulis;
    this.penerbit = penerbit;
    this.stok = stok;
    this.hargaJual = hargaJual;
  }

  public String getKodeBuku() {
    return kodeBuku;
  }

  public String getJudul() {
    return judul;
  }

  public String getPenulis() {
    return penulis;
  }

  public String getPenerbit() {
    return penerbit;
  }

  public int getStok() {
    return stok;
  }

  public double getHargaJual() {
    return hargaJual;
  }

  public void kurangiStok(int jumlah) {
    if (this.stok >= jumlah) {
      this.stok -= jumlah;
    }
  }

  public void tambahStok(int jumlah) {
    this.stok += jumlah;
  }

  public void tampilkanInfoBuku() {
    System.out.println("[" + kodeBuku + "] " + judul + " oleh " + penulis + " (Stok: " + stok + ") - Rp " + hargaJual);
  }
}
