package trial.minggu5.p7;

public class Bank {
  private Nasabah[] nasabah;
  private int jumlahNasabah = 0;

  public Bank() {
    nasabah = new Nasabah[100];
  }

  public void tambahNasabah(String namaAwal, String namaAkhir) {
    if (jumlahNasabah >= nasabah.length) {
      throw new IllegalStateException("Kapasitas nasabah penuh");
    }

    nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
    jumlahNasabah++;
  }

  public int getJumlahNasabah() {
    return jumlahNasabah;
  }

  public Nasabah getNasabah(int indeks) {
    if (indeks < 0 || indeks >= jumlahNasabah) {
      throw new IndexOutOfBoundsException("Indeks nasabah tidak valid");
    }

    return nasabah[indeks];
  }
}
