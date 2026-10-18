package UTS;

public class Buku {
  private String kodeBuku;
  private String judul;
  private Penulis penulis;
  private Penerbit penerbit;
  private Stok stok;
  private double hargaJual;

  public Buku(String kodeBuku, String judul, Penulis penulis, Penerbit penerbit, int jumlahStok, double hargaJual) {
    this.kodeBuku = kodeBuku;
    this.judul = judul;
    this.penulis = penulis;
    this.penerbit = penerbit;
    this.stok = new Stok(jumlahStok);
    this.hargaJual = hargaJual;
  }

  public String getKodeBuku() {
    return kodeBuku;
  }

  public String getJudul() {
    return judul;
  }

  public int getStok() {
    return stok.getJumlah();
  }

  public double getHargaJual() {
    return hargaJual;
  }

  public boolean kurangiStok(int jumlah) {
    return stok.kurangi(jumlah);
  }

  public void tambahStok(int jumlah) {
    stok.tambah(jumlah);
  }

  public void tampilkanInfo() {
    System.out.println("[" + kodeBuku + "] " + judul + " | Penulis: " + penulis.getNama()
        + " | Penerbit: " + penerbit.getNama() + " | Stok: " + getStok() + " | Harga: Rp " + hargaJual);
  }
}
