package trial.minggu4.p6;

public class Main {
  public static void main(String[] args) {
    Nasabah n1 = new Nasabah("N01", "Ahmad");
    Nasabah n2 = new Nasabah("N02", "Budi");

    Rekening rek1 = new Rekening("111-222", 500000, n1);
    Rekening rek2 = new Rekening("333-444", 200000, n2);

    Bank bank = new Bank("Bank Mandiri");

    System.out.println("=== Kondisi Awal ===");
    rek1.infoRekening();
    rek2.infoRekening();

    System.out.println("\n=== Proses Transfer ===");
    bank.transfer(rek1, rek2, 150000);

    System.out.println("\n=== Kondisi Akhir ===");
    rek1.infoRekening();
    rek2.infoRekening();
  }
}
