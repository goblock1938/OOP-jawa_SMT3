package trial.minggu4.p5;

import java.util.Scanner;

public class tugas5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("String kalimat utama : ");
    String kalimatUtama = scanner.nextLine();

    System.out.print("String yang diganti  : ");
    String target = scanner.nextLine();

    System.out.print("String pengganti     : ");
    String pengganti = scanner.nextLine();

    String hasil = kalimatUtama.replace(target, pengganti);

    System.out.println("Kalimat utama menjadi : " + hasil);

    scanner.close();
  }
}
