package trial.minggu3.p3;

import java.util.Scanner;

public class latihan2 {
  public static void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan Nilai Faktorial : ");

    int n = scanner.nextInt();
    long hasil = 1;
    for (int i = 1; n >= i; i++) {
      hasil *= i;
      System.out.printf("%5d \t %10d\n", i, hasil);
    }

    scanner.close();
  }
}
