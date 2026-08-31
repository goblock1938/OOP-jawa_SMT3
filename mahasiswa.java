import trial.minggu1.*;

public class mahasiswa {
  public static void main(String[] args) {
    Mahasiswa mhs = new Mahasiswa(12345, "Jono");
    System.out.println("NRP : " + mhs.getNrp());
    System.out.println("Nama : " + mhs.getnama());
  }
}
