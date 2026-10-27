package UTS;

public class Petugas {
  private String idPetugas;
  private String nama;

  public Petugas(String idPetugas, String nama) {
    this.idPetugas = idPetugas;
    this.nama = nama;
  }

  public void tampilkanInfo() {
    System.out.println("Dilayani petugas: " + nama + " (" + idPetugas + ")");
  }
}
