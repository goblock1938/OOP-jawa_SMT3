package encapsulation.p8;

public class Tabungan {
  private int saldo;

  public Tabungan(int initsaldo) {
    this.saldo = initsaldo;
  }

  private int toIDR(int jumlah, String mataUang) {
    switch (mataUang.toUpperCase()) {
      case "AUD":
        return jumlah * 10000;
      case "USD":
        return jumlah * 9000;
      case "IDR":
      default:
        return jumlah;
    }
  }

  private double fromIDR(int saldoIDR, String mataUang) {
    switch (mataUang.toUpperCase()) {
      case "AUD":
        return (double) saldoIDR / 10000;
      case "USD":
        return (double) saldoIDR / 9000;
      case "IDR":
      default:
        return saldoIDR;
    }
  }

  public double getSaldo(String mataUang) {
    return fromIDR(this.saldo, mataUang);
  }

  public int getSaldo() {
    return this.saldo;
  }

  public void simpanUang(int jumlah, String mataUang) {
    int jumlahIDR = toIDR(jumlah, mataUang);
    this.saldo += jumlahIDR;
  }

  public boolean ambilUang(int jumlah, String mataUang) {
    int jumlahIDR = toIDR(jumlah, mataUang);

    if (this.saldo >= jumlahIDR) {
      this.saldo -= jumlahIDR;
      return true;
    }
    return false;
  }
}
