package UTS;

public class Pembayaran {
  private String idPembayaran;
  private double jumlahBayar;
  private String metode;

  public Pembayaran(String idPembayaran, double jumlahBayar, String metode) {
    this.idPembayaran = idPembayaran;
    this.jumlahBayar = jumlahBayar;
    this.metode = metode;
  }

  public void cetakStruk() {
    System.out.println("Pembayaran " + idPembayaran + " | " + metode + " | Rp " + jumlahBayar + " | LUNAS");
  }
}
