package encapsulation.p8;

public class coba1 {
  private int nrp;
  private String nama;

  public coba1(int nrp, String nama) {
    this.nrp = nrp;
    this.nama = nama;
  }

  public int getNrp() {
    return this.nrp;
  }

  public String getNama() {
    return this.nama;
  }

  public void setNrp(int nrp) {
    this.nrp = nrp;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }
}
