package over.p12.tugas2;

public class Kecebong extends Katak {
  private final double panjangEkor;

  public Kecebong(int umur, String nama, double panjangEkor) {
    super(umur, nama);
    this.panjangEkor = panjangEkor;
  }

  @Override
  public String caraBergerak() {
    return "berenang";
  }
}
