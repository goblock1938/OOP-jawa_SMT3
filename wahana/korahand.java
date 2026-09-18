package wahana;

import java.util.Scanner;

// main code from alvin and ubay 
public class korahand {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int JUMLAH_OBJEK = 5;

    KoraHandover[] daftarKoraKora = new KoraHandover[JUMLAH_OBJEK];

    System.out.println("=====================================");
    System.out.println("   INPUT DATA WAHANA KORA-KORA       ");
    System.out.println("=====================================");

    for (int i = 0; i < JUMLAH_OBJEK; i++) {
      System.out.println("\n>> Input Wahana Ke-" + (i + 1));

      System.out.print("Masukkan Kode Wahana           : ");
      String kode = scanner.nextLine();

      System.out.print("Masukkan Nama Wahana           : ");
      String nama = scanner.nextLine();

      System.out.print("Masukkan Kapasitas Maksimal    : ");
      int kapasitas = scanner.nextInt();

      System.out.print("Masukkan Harga Tiket (Rp)      : ");
      double hargaTiket = scanner.nextDouble();

      System.out.print("Masukkan Jumlah Penumpang Saat Ini : ");
      int jumlahPenumpang = scanner.nextInt();

      scanner.nextLine();

      daftarKoraKora[i] = new KoraHandover(kode, nama, kapasitas, hargaTiket, jumlahPenumpang);
    }

    scanner.close();

    int totalKapasitasMax = 0;
    int totalSeluruhPenumpang = 0;
    double totalPendapatanKeseluruhan = 0.0;
    double pendapatanTerbanyak = 0.0;
    String namaWahanaTerlaris = "-";

    System.out.println("\n=====================================");
    System.out.println("     DATA SELURUH WAHANA KORA-KORA   ");
    System.out.println("=====================================\n");

    for (int i = 0; i < daftarKoraKora.length; i++) {
      System.out.println(">> Wahana Ke-" + (i + 1));

      daftarKoraKora[i].infoWahana();
      daftarKoraKora[i].cekKapasitas();
      System.out.println("Status Operasional: " + daftarKoraKora[i].getStatusKapasitas());

      double pendapatanWahanaIni = daftarKoraKora[i].hitungPendapatan();
      System.out.printf("Total Pendapatan  : Rp %,.2f\n", pendapatanWahanaIni);
      System.out.println("-------------------------------------\n");

      totalKapasitasMax += daftarKoraKora[i].kapasitas;
      totalSeluruhPenumpang += daftarKoraKora[i].jumlahPenumpang;
      totalPendapatanKeseluruhan += pendapatanWahanaIni;

      if (pendapatanWahanaIni > pendapatanTerbanyak) {
        pendapatanTerbanyak = pendapatanWahanaIni;
        namaWahanaTerlaris = daftarKoraKora[i].nama;
      }
    }

    System.out.println("=====================================");
    System.out.println("        REKAPITULASI KORA-KORA       ");
    System.out.println("=====================================");
    System.out.println("1. Total Kapasitas Max Seluruh Wahana : " + totalKapasitasMax + " orang");
    System.out.println("2. Total Jumlah Penumpang Saat Ini    : " + totalSeluruhPenumpang + " orang");
    System.out.printf("3. Pendapatan Terbanyak               : Rp %,.2f (Oleh: %s)\n", pendapatanTerbanyak,
        namaWahanaTerlaris);
    System.out.printf("4. Total Pendapatan Keseluruhan       : Rp %,.2f\n", totalPendapatanKeseluruhan);
    System.out.println("=====================================");
  }

}
