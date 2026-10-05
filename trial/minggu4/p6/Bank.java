package trial.minggu4.p6;

public class Bank {
  private String namaBank;

  public Bank(String namaBank) {
    this.namaBank = namaBank;
  }

  public boolean transfer(Rekening asal, Rekening tujuan, double nominal) {
    if (asal.tarik(nominal)) {
      tujuan.setor(nominal);
      System.out.println("Transfer sebesar Rp " + nominal + " berhasil.");
      return true;
    }
    System.out.println("Transfer gagal! Saldo tidak mencukupi.");
    return false;
  }
}
