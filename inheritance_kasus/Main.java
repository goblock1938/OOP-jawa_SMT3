public class Main {
  public static void main(String[] args) {
    MahasiswaSDT m = new MahasiswaSDT("Andi", "andi@pens.ac.id", "202501001", "Teknik Informatika",
        "Software Development", 5);
    System.out.println("=== IDENTITAS ===");
    m.tampilkanIdentitas();
    System.out.println("\n=== DATA AKADEMIK ===");
    m.tampilkanDataAkademik();
    System.out.println("\n=== PERAN ===");
    m.tampilkanPeran();
    System.out.println("\n=== DETAIL SDT ===");
    m.tampilkanDetailSDT();
    System.out.println("\n=== AKSES ATRIBUT ===");
    System.out.println("m.nama = " + m.nama);
    System.out.println("m.email = " + m.email);
    System.out.println("m.nrp = " + m.nrp);
  }
}
