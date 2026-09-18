package trial.minggu4.p5;

import java.util.Scanner;

public class tugas3 {
  public static void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("String masukan : ");
    String nama = scanner.nextLine();

    if (nama.isEmpty()) { // jika tidak meng input apa - apa
      System.out.println("String hasil   : ");
      scanner.close();
      return;
    }

    char targetAwal = Character.toLowerCase(nama.charAt(0));
    char targetAkhir = Character.toLowerCase(nama.charAt(nama.length() - 1));

    StringBuilder hasil = new StringBuilder(); // kita menggunakan string builder karena mudah diubah

    for (char ch : nama.toCharArray()) {
      char chLower = Character.toLowerCase(ch);
      boolean isUpper = Character.isUpperCase(ch); // untuk state jika char kapital

      if (chLower == targetAwal)
        hasil.append(isUpper ? Character.toUpperCase(targetAkhir) : targetAkhir);
      // menggunakan append karena kita menggunakan StringBuilder bukan String biasa
      else if (chLower == targetAkhir)
        hasil.append(isUpper ? Character.toUpperCase(targetAwal) : targetAwal);
      // append ke string menggunakan operasi ternary
      else
        hasil.append(ch);

    }

    System.out.println("String hasil   : " + hasil.toString());
    scanner.close();
  }
}
