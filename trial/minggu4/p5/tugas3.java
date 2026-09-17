package trial.minggu4.p5;

import java.util.Scanner;

public class tugas3 {
  public static void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("String masukan : ");
    String nama = scanner.nextLine();

    if (nama.isEmpty()) {
      System.out.println("String hasil   : ");
      scanner.close();
      return;
    }

    char targetAwal = Character.toLowerCase(nama.charAt(0));
    char targetAkhir = Character.toLowerCase(nama.charAt(nama.length() - 1));

    StringBuilder hasil = new StringBuilder();

    for (char ch : nama.toCharArray()) {
      char chLower = Character.toLowerCase(ch);
      boolean isUpper = Character.isUpperCase(ch);

      if (chLower == targetAwal) {

        hasil.append(isUpper ? Character.toUpperCase(targetAkhir) : targetAkhir);
      } else if (chLower == targetAkhir) {

        hasil.append(isUpper ? Character.toUpperCase(targetAwal) : targetAwal);
      } else {

        hasil.append(ch);
      }
    }

    System.out.println("String hasil   : " + hasil.toString());
    scanner.close();
  }
}
