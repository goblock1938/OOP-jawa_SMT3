package trial.minggu4.p5;

import java.util.Scanner;

public class tugas1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Kalimat  : ");
    String kalimat = scanner.nextLine();

    System.out.print("Karakter : ");
    char karakter = scanner.next().charAt(0);

    int found = 0;

    for (int i = 0; i < kalimat.length(); i++) {
      if (kalimat.charAt(i) == karakter) {
        found++;
      }
    }

    if (found > 0) {
      System.out.println("Output   : Karakter '" + karakter + "' Ditemukan sebanyak " + found);
    } else {
      System.out.println("Output   : Karakter '" + karakter + "' tidak ditemukan dalam kalimat.");
    }

    scanner.close();
  }
}
