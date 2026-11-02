package polimorfisme.p13.latihan4;

public class Main {
  public static void main(String[] args) {
    cetakInfo(new Manajer("Alya", "Operasional"));
    cetakInfo(new Kurir("Bima", "Surabaya"));
  }

  private static void cetakInfo(Pegawai pegawai) {
    pegawai.tampilkanInfo();
  }
}
