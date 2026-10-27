package over.p12.tugas2;

public class Katak {
  private final int umur;
  private final String nama;

  public Katak(int umur, String nama) {
    this.umur = umur;
    this.nama = nama;
  }

  public int getUmur() {
    return umur;
  }

  public String getNama() {
    return nama;
  }

  public String caraBergerak() {
    return "melompat";
  }
}
