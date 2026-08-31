package trial.minggu1;

public class Truk {
  public double muatan;
  public double muatanMaks;

  public Truk(double muatanMaks) {
    this.muatanMaks = muatanMaks;
  }

  public double getMuatan() {
    return muatan;
  }

  public double getMuatanMaks() {
    return muatanMaks;
  }

  public void tambahMuatan(double berat) {
    if (muatan + berat < muatanMaks) {
      muatan += berat;
    }
  }
}
