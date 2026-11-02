package polimorfisme.p13.latihan4;

public class Pegawai {
  private final String nama;

  public Pegawai(String nama) {
    this.nama = nama;
  }

  public void tampilkanInfo() {
    System.out.println("Pegawai: " + nama);
  }

  protected String getNama() {
    return nama;
  }
}
