package wahana;

// class code ihsan dan fikri
class Bianglala {
  private String nama;
  private double tinggi;
  private int kapasitas;
  private double hargaTiket;
  private int jumlahPenumpang;
  private boolean statusOperasional;

  public Bianglala(String nama, double tinggi, int kapasitas, double hargaTiket, int jumlahPenumpang) {
    this.nama = nama;
    this.tinggi = tinggi;
    this.kapasitas = kapasitas;
    this.hargaTiket = hargaTiket;
    this.jumlahPenumpang = jumlahPenumpang;
    this.statusOperasional = false;
  }

  public String getNama() {
    return nama;
  }

  public int getJumlahPenumpang() {
    return jumlahPenumpang;
  }

  // mengambil sisa kapasitas yang tersedia
  public int cekKapasitas() {
    return kapasitas - jumlahPenumpang;
  }

  // public String cekKondisiOperasional() {
  // if (this.jumlahPenumpang >= cekKapasitas()) {
  // return "PENUH";
  // } else {
  // return "TERSEDIA";
  // }
  // }

  public double hitungPendapatan() {
    return jumlahPenumpang * hargaTiket;
  }

  public void putar() {
    this.statusOperasional = true;
  }

  public void hentikan() {
    this.statusOperasional = false;
  }

  public void tampilkanInformasi() {
    System.out.println("Nama Wahana: " + nama);
    System.out.println("Tinggi: " + tinggi + " meter");
    System.out.println("Kapasitas Max: " + kapasitas + " orang");
    System.out.println("Jumlah Penumpang: " + jumlahPenumpang + " orang");
    // System.out.println("Kondisi Operasional: " + cekKondisiOperasional());
    System.out.println("Harga Tiket: Rp " + (long) hargaTiket);
    System.out.println("Pendapatan: Rp " + (long) hitungPendapatan());
    System.out.println("Status Beroperasi: " + (statusOperasional ? "Sedang Berputar" : "Berhenti"));
  }
}
