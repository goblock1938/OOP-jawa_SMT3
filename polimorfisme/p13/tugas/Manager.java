package polimorfisme.p13.tugas;

public class Manager extends Pegawai {
  private int tunjangan;

  public Manager(String nama, int gaji, int tunjangan) {
    super(nama, gaji);
    this.tunjangan = tunjangan;
  }

  public int infoGaji() {
    return gaji;
  }

  public int infoTunjangan() {
    return tunjangan;
  }
}
