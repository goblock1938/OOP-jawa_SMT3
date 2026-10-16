package UTS;

public abstract class Transaksi {
  protected String idTransaksi;
  protected Anggota anggota;
  protected Petugas petugas;
  protected Pembayaran pembayaran;

  public Transaksi(String idTransaksi, Anggota anggota, Petugas petugas) {
    this.idTransaksi = idTransaksi;
    this.anggota = anggota;
    this.petugas = petugas;
  }

  public abstract void prosesTransaksi();
}
