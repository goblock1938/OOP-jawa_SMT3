package over.p12.tugas2;

public class TesTugas2 {
  public static void main(String[] args) {
    Katak o1 = new Katak(5, "Froggy");
    Katak o2 = new Kecebong(2, "Junior Frog", 10);

    assert o1.caraBergerak().equals("melompat");
    assert o2.caraBergerak().equals("berenang");
    tampilkanInfo(o1);
    tampilkanInfo(o2);
  }

  private static void tampilkanInfo(Katak katak) {
    System.out.println("Nama: " + katak.getNama());
    System.out.println("Umur: " + katak.getUmur());
    System.out.println("Cara bergerak: " + katak.caraBergerak());
    System.out.println();
  }
}
