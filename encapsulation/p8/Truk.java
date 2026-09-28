package encapsulation.p8;

public class Truk {
  private double muatan;
  private double muatanmaks;

  public Truk(double beratmaks) {
    this.muatanmaks = kiloToNewts(beratmaks);
    this.muatan = 0;
  }

  public double getMuatan() {
    return newtsToKilo(this.muatan);
  }

  public double getMuatanMaks() {
    return newtsToKilo(this.muatanmaks);
  }

  public boolean tambahMuatan(double berat) {
    double beratNewts = kiloToNewts(berat);

    if (this.muatan + beratNewts <= this.muatanmaks) {
      this.muatan += beratNewts;
      return true;
    }
    return false;
  }

  public double newtsToKilo(double berat) {
    return berat / 9.8;
  }

  public double kiloToNewts(double berat) {
    return berat * 9.8;
  }
}
