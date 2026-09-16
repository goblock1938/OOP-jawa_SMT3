package trial.minggu3.p4;

import java.util.Scanner;

public class latihan3 {
  public static void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan bilangan? ");
    int n = scanner.nextInt();

    boolean isPrima = true;

    if (n <= 1) {
      isPrima = false;
    } else {
      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
          isPrima = false;
          break;
        }
      }
    }

    if (isPrima)
      System.out.println(n + " adalah bilangan prima");
    else
      System.out.println(n + " bukan termasuk bilangan prima");

    scanner.close();
  }
}
