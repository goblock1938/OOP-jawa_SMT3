package encapsulation.p8;

public class tugas {
  public static void main(String[] args) {
    boolean status;

    Tabungan tabungan = new Tabungan(1000000);

    System.out.println("=== SALDO AWAL ===");
    System.out.println("Saldo (IDR) : Rp " + tabungan.getSaldo("IDR"));
    System.out.println("Saldo (USD) : $ " + tabungan.getSaldo("USD"));
    System.out.println("Saldo (AUD) : $ " + tabungan.getSaldo("AUD"));

    System.out.println("\n=== TRANSAKSI SIMPAN UANG ===");
    System.out.println("Menyimpan 100 USD...");
    tabungan.simpanUang(100, "USD");
    System.out.println("Saldo sekarang (IDR) : Rp " + tabungan.getSaldo());

    System.out.println("Menyimpan 50 AUD...");
    tabungan.simpanUang(50, "AUD");
    System.out.println("Saldo sekarang (IDR) : Rp " + tabungan.getSaldo());

    System.out.println("\n=== TRANSAKSI PENARIKAN UANG ===");
    System.out.println("Mencoba mengambil 150 USD...");
    status = tabungan.ambilUang(150, "USD");
    System.out.println("Status penarikan : " + (status ? "Berhasil (OK)" : "Gagal"));
    System.out.println("Saldo sekarang (IDR) : Rp " + tabungan.getSaldo());

    System.out.println("\nMencoba mengambil 200 AUD...");
    status = tabungan.ambilUang(200, "AUD");
    System.out.println("Status penarikan : " + (status ? "Berhasil (OK)" : "Gagal"));
    System.out.println("Saldo sekarang (IDR) : Rp " + tabungan.getSaldo());

    System.out.println("\n=== SALDO AKHIR ===");
    System.out.println("Saldo Akhir (IDR) : Rp " + tabungan.getSaldo("IDR"));
    System.out.println("Saldo Akhir (USD) : $ " + tabungan.getSaldo("USD"));
    System.out.println("Saldo Akhir (AUD) : $ " + tabungan.getSaldo("AUD"));
  }
}
