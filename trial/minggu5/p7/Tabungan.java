package trial.minggu5.p7;

public class Tabungan {
  private int saldo;

  public Tabungan(int saldo) {
    this.saldo = saldo;
  }

  public int getSaldo() {
    return saldo;
  }

  public void simpanUang(int jumlah) {
    saldo += jumlah;
  }

  public boolean ambilUang(int jumlah) {
    if (jumlah > saldo)
      return false;

    saldo -= jumlah;
    return true;
  }
}
