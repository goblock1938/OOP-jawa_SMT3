package polimorfisme.p13.latihan4;

public class Manajer extends Pegawai {
  private final String departemen;

  public Manajer(String nama, String departemen) {
    super(nama);
    this.departemen = departemen;
  }

  @Override
  public void tampilkanInfo() {
    System.out.println("Manajer: " + getNama() + " | Departemen: " + departemen);
  }
}
