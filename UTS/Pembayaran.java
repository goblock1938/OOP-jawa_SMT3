package UTS;

public class Pembayaran {
  private String idPembayaran;
  private double jumlahBayar;
  private String metode;
  private boolean statusLunas;

  public Pembayaran(String idPembayaran, double jumlahBayar, String metode) {
    this.idPembayaran = idPembayaran;
    this.jumlahBayar = jumlahBayar;
    this.metode = metode;
    this.statusLunas = true;
  }

  public void cetakStrukPembayaran() {
    System.out.println("   [PEMBAYARAN ID: " + idPembayaran + "]");
    System.out.println("   Metode : " + metode);
    System.out.println("   Total  : Rp " + jumlahBayar);
    System.out.println("   Status : " + (statusLunas ? "LUNAS" : "BELUM LUNAS"));
  }
}
