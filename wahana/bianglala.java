package wahana;

import java.util.Scanner;

// main code ihsan dan fikri
public class bianglala {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bianglala[] daftarBianglala = new Bianglala[5];

    daftarBianglala[0] = new Bianglala("Senja Raksasa", 50.0, 24, 35000.0, 144);
    daftarBianglala[1] = new Bianglala("Ceria Kids", 15.5, 10, 20000.0, 25);
    daftarBianglala[2] = new Bianglala("Sky View VIP", 65.0, 18, 75000.0, 36);
    daftarBianglala[3] = new Bianglala("Starlight Express", 40.0, 20, 30000.0, 80);
    daftarBianglala[4] = new Bianglala("Romantic Sunset", 30.0, 16, 45000.0, 64);

    daftarBianglala[0].putar();
    daftarBianglala[2].putar();

    // System.out.println("Informasi Wahana:");
    // int index = 1;
    // for (Bianglala bgl : daftarBianglala) {
    // System.out.println("\nWahana ke-" + index + ":");
    // bgl.tampilkanInformasi();
    // index++;
    // }

    // System.out.println("\nStatus Kapasitas:");
    // for (Bianglala bgl : daftarBianglala) {
    // System.out.println(bgl.getNama() + " (" + bgl.getJumlahPenumpang() + "/" +
    // bgl.hitungKapasitasTotal() + " orang) -> " + bgl.cekKondisiOperasional());
    // }

    System.out.println("\nTotal Pendapatan:");
    double totalPendapatan = 0;
    for (Bianglala bgl : daftarBianglala) {
      totalPendapatan += bgl.hitungPendapatan();
    }
    System.out.println("Rp " + (long) totalPendapatan);

    System.out.print("\nMasukkan nama wahana yang ingin dicari: ");
    String cari = scanner.nextLine().trim(); // tambahan .trim() untuk menghapus spasi di awal dan akhir
    boolean found = false;
    for (Bianglala bgl : daftarBianglala) {
      if (bgl.getNama().equalsIgnoreCase(cari)) {
        System.out.println("\nInformasi Wahana yang dicari:");
        bgl.tampilkanInformasi();
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Wahana dengan nama '" + cari + "' tidak ditemukan.");
    }

    scanner.close();
  }
}
