package wahana;

// Class code from alvin dan ubay
public class KoraHandover {
  String kode;
  String nama;
  int kapasitas;
  double hargaTiket;
  int jumlahPenumpang;

  // Constructor
  public KoraHandover(String kode, String nama, int kapasitas, double hargaTiket, int jumlahPenumpang) {
    this.kode = kode;
    this.nama = nama;
    this.kapasitas = kapasitas;
    this.hargaTiket = hargaTiket;
    this.jumlahPenumpang = jumlahPenumpang;
  }

  // Method untuk menampilkan info wahana
  public void infoWahana() {
    System.out.println("--- Informasi Wahana ---");
    System.out.println("Kode Wahana      : " + kode);
    System.out.println("Nama Wahana      : " + nama);
    System.out.println("Kapasitas Maks   : " + kapasitas + " orang");
    System.out.println("Harga Tiket      : Rp " + hargaTiket);
    System.out.println("Jumlah Penumpang : " + jumlahPenumpang + " orang");
  }

  // Method untuk menghitung pendapatan
  public double hitungPendapatan() {
    return hargaTiket * jumlahPenumpang;
  }

  // Method untuk menampilkan detail sisa kursi
  public void cekKapasitas() {
    if (jumlahPenumpang > kapasitas) {
      System.out.println("Detail Kapasitas : OVERLOAD! Penumpang melebihi batas (" + kapasitas + ").");
    } else if (jumlahPenumpang == kapasitas) {
      System.out.println("Detail Kapasitas : PENUH! Wahana siap diberangkatkan.");
    } else {
      int sisaKursi = kapasitas - jumlahPenumpang;
      System.out.println("Detail Kapasitas : Masih tersedia " + sisaKursi + " kursi kosong.");
    }
  }

  // Method untuk menampilkan status operasional (TERSEDIA / PENUH)
  public String getStatusKapasitas() {
    if (jumlahPenumpang >= kapasitas) {
      return "PENUH";
    } else {
      return "TERSEDIA";
    }
  }
}

// input tidak dinamis, harus input 5
// tidak ada validasi input, misal kapasitas tidak boleh negatif,
//
