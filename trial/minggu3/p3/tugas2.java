package trial.minggu3.p3;

import java.util.Scanner;

public class tugas2 {
  public static void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan tahun (1900-2005) : ");
    int tahun = scanner.nextInt();

    if (tahun < 1900)
      System.out.println("Maaf, tahun input dibawah 1900");
    else if (tahun > 2005)
      System.out.println("Maaf, tahun input diatas 2005");
    else {
      if ((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0))
        System.out.println(tahun + " adalah tahun kabisat");
      else
        System.out.println(tahun + " bukan tahun kabisat");

    }

    scanner.close();
  }
}
