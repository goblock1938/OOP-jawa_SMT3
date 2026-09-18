package trial.minggu3.p4;

import java.util.Scanner;

public class latihan2 {
  public static void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan berapa deret Fibonacci? ");
    int n = scanner.nextInt();

    int a = 0; // nilai Fibonacci pertama
    int b = 1; // nilai Fibonacci setelahnya

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
