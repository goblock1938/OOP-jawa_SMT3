package trial.minggu1;

public class Tabungan {
  public int saldo;

  public Tabungan(int initSaldo) {
    saldo = initSaldo;
  }

  public boolean ambilUang(int jumlah) {
    if (saldo < jumlah)
      return false;
    else {
      saldo -= jumlah;
      return true;
    }
  }

  public int getSaldo() {
    return saldo;
  }

  public void simpanUang(int jumlah) {
    saldo += jumlah;
  }
}
