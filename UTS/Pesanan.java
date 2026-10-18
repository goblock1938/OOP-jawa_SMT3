package UTS;

public class Pesanan extends Transaksi {
  private Buku buku;
  private int jumlah;
  private String metodePembayaran;
  private boolean sudahDiproses;

  public Pesanan(String idTransaksi, Anggota anggota, Petugas petugas, Buku buku, int jumlah,
      String metodePembayaran) {
    super(idTransaksi, anggota, petugas);
    this.buku = buku;
    this.jumlah = jumlah;
    this.metodePembayaran = metodePembayaran;
  }

  @Override
  public void prosesTransaksi() {
    if (sudahDiproses) {
      System.out.println("Pesanan " + getIdTransaksi() + " sudah diproses.");
      return;
    }
    System.out.println("\n=== PESANAN " + getIdTransaksi() + " ===");
    tampilkanPihak();
    if (!buku.kurangiStok(jumlah)) {
      System.out.println("Pesanan gagal: stok buku tidak mencukupi.");
      return;
    }
    sudahDiproses = true;
    new Pembayaran("PAY-" + getIdTransaksi(), buku.getHargaJual() * jumlah, metodePembayaran).cetakStruk();
  }
}
