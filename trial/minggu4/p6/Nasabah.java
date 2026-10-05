package trial.minggu4.p6;

public class Nasabah {
  private String idNasabah;
  private String nama;

  public Nasabah(String idNasabah, String nama) {
    this.idNasabah = idNasabah;
    this.nama = nama;
  }

  public String getNama() {
    return this.nama;
  }

  public void ubahNama(String namaBaru) {
    this.nama = namaBaru;
  }
}
