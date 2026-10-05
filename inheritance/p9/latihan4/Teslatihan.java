package inheritance.p9.latihan4;

import inheritance.p9.latihan4.perbankan.*;

public class Teslatihan {
  public static void main(String args[]) {
    PenyimpananUang tabungan = new PenyimpananUang(5000, 8.5 / 100);
    System.out.println("Uang yang ditabung: 5000");
    System.out.println("Tingkat bunga sekarang: 8.5%");
    System.out.println("Total uang anda sekarang: " + tabungan.cekUang());
  }
}
