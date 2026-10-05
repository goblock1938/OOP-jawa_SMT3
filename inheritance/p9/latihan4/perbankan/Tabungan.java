package inheritance.p9.latihan4.perbankan;

public class Tabungan {
  protected int saldo;

  public Tabungan(int saldo) {
    this.saldo = saldo;
  }

  public int getSaldo() {
    return this.saldo;
  }

  public void simpanUang(int jumlah) {
    this.saldo += jumlah;
  }

  public boolean ambilUang(int jumlah) {
    if (this.saldo >= jumlah) {
      this.saldo -= jumlah;
      return true;
    }
    return false;
  }
}
