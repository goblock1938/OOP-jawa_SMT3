package wahana;

import java.util.Scanner;

// class code from dharil and fira
class Kora2 {
  int kode;
  int kapasitas, jumlahPenumpang;
  long hargaTiket;
  String nama;

  void infoWahana() {
    System.out.println("Nama wahana : " + nama + "\nharga tiket per orang : " + hargaTiket
        + "\nDengan kapasitas maksimal : " + kapasitas);
  }

  long hitungPendapatan() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("masukkan jumlah penumpang : ");
    jumlahPenumpang = scanner.nextInt();
    scanner.close();
    if (cekKapasitas())
      return jumlahPenumpang * hargaTiket;
    return 0;
  }

  boolean cekKapasitas() {
    if (jumlahPenumpang > kapasitas) {
      System.out.println("jumlah penumpang melebihi kapasitas!!");
      return false;
    } else
      System.out.println("kapasitas ok");
    return true;
  }
}
