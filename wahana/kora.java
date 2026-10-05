package wahana;

import java.util.Scanner;

// main code from dharil and fira
public class kora {
  public static void main(String args[]) {
    Kora2[] kora = new Kora2[5];
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.print("Masukkan id kora - kora : ");
      kora[i].kode = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Masukkan kapasitas kora - kora : ");
      kora[i].kapasitas = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Masukkan nama kora - kora : ");
      kora[i].nama = scanner.nextLine();
      System.out.print("Masukkan harga per-orangnya  : ");
      kora[i].hargaTiket = scanner.nextLong();
      System.out.println("informasi wahana\n");
      kora[i].infoWahana();
      System.out.println("pendapatan kita hari ini adalah : " + kora[i].hitungPendapatan());
    }
    scanner.close();
  }
}
