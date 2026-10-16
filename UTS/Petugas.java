package UTS;

public class Petugas {
  private String idPetugas;
  private String namaPetugas;

  public Petugas(String idPetugas, String namaPetugas) {
    this.idPetugas = idPetugas;
    this.namaPetugas = namaPetugas;
  }

  public String getIdPetugas() {
    return idPetugas;
  }

  public String getNamaPetugas() {
    return namaPetugas;
  }

  public void infoPetugas() {
    System.out.println("Petugas Layanan: " + namaPetugas + " (" + idPetugas + ")");
  }
}
