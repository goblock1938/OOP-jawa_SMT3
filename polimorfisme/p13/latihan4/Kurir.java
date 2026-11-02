package polimorfisme.p13.latihan4;

public class Kurir extends Pegawai {
  private final String areaPengantaran;

  public Kurir(String nama, String areaPengantaran) {
    super(nama);
    this.areaPengantaran = areaPengantaran;
  }

  @Override
  public void tampilkanInfo() {
    System.out.println("Kurir: " + getNama() + " | Area pengantaran: " + areaPengantaran);
  }
}