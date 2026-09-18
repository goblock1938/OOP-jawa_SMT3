package trial.minggu4.p6;

public class Rekening {
  private String noRekening;
  private double saldo;
  private Nasabah pemilik;

  public Rekening(String noRekening, double saldoAwal, Nasabah pemilik) {
    this.noRekening = noRekening;
    this.saldo = saldoAwal;
    this.pemilik = pemilik;
  }

  public void setor(double jumlah) {
    if (jumlah > 0) {
      this.saldo += jumlah;
    }
  }

  public boolean tarik(double jumlah) {
    if (jumlah > 0 && this.saldo >= jumlah) {
      this.saldo -= jumlah;
      return true;
    }
    return false;
  }

  public double cekSaldo() {
    return this.saldo;
  }

  public void infoRekening() {
    System.out.println("No Rekening: " + noRekening + " | Pemilik: " + pemilik.getNama() + " | Saldo: Rp " + saldo);
  }
}
