package over.p12.coba;

import java.awt.Point;

public class Main {
  public static void main(String[] arguments) {
    SegiEmpat rect = new SegiEmpat();
    System.out.println("Buat SegiEmpat dengan koordinat (25,25) dan (50,50)");
    rect.buatSegiempat(25, 25, 50, 50);
    rect.cetakSegiempat();
    System.out.println();
    System.out.println("Buat SegiEmpat dengan point (10,10) danpoint (20,20):");

    rect.buatSegiempat(new Point(10, 10), new Point(20, 20));
    rect.cetakSegiempat();
    System.out.println();
    System.out.print("Buat SegiEmpat dengan 1 point (10,10), koodinat (50,50)");
    rect.buatSegiempat(new Point(10, 10), 50, 50);
    rect.cetakSegiempat();
  }
}
