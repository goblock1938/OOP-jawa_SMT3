package UTS;

public class Transaksi {
  private String idTransaksi;
  private Anggota anggota;
  private Petugas petugas;

  public Transaksi(String idTransaksi, Anggota anggota, Petugas petugas) {
    this.idTransaksi = idTransaksi;
    this.anggota = anggota;
    this.petugas = petugas;
  }

  public String getIdTransaksi() {
    return idTransaksi;
  }

  public Anggota getAnggota() {
    return anggota;
  }

  protected void tampilkanPihak() {
    anggota.tampilkanInfo();
    petugas.tampilkanInfo();
  }

  public void prosesTransaksi() {
    System.out.println("Transaksi " + idTransaksi + " belum memiliki proses khusus.");
  }
}
