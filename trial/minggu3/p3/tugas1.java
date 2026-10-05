package trial.minggu3.p3;

import java.util.Scanner;

public class tugas1 {
  public static void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan berapa deret Fibonacci? ");
    int n = scanner.nextInt();

    int a = 1;
    int b = 1;

    System.out.print(n + " deret Fibonacci = ");
    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      int next = a + b;
      a = b;
      b = next;
    }
    System.out.println();

    scanner.close();
  }
}
