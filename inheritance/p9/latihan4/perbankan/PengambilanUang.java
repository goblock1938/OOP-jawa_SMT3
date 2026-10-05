package inheritance.p9.latihan4.perbankan;

public class PengambilanUang extends Tabungan {
  private int proteksi;

  public PengambilanUang(int saldo) {
    super(saldo);
    this.proteksi = 0;
  }

  public PengambilanUang(int saldo, int proteksi) {
    super(saldo);
    this.proteksi = proteksi;
  }

  public boolean tarikUang(int jumlah) {
    if ((saldo - jumlah) >= proteksi) {
      return super.ambilUang(jumlah);
    }
    return false;
  }
}
