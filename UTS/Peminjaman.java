package UTS;

public class Peminjaman extends Transaksi {
  private Buku buku;
  private int lamaHari;
  private boolean aktif;
  private boolean sudahDiproses;

  public Peminjaman(String idTransaksi, Anggota anggota, Petugas petugas, Buku buku, int lamaHari) {
    super(idTransaksi, anggota, petugas);
    this.buku = buku;
    this.lamaHari = lamaHari;
  }

  public boolean isAktif() {
    return aktif;
  }

  public boolean prosesPengembalian() {
    if (!aktif) {
      return false;
    }
    buku.tambahStok(1);
    aktif = false;
    return true;
  }

  @Override
  public void prosesTransaksi() {
    if (sudahDiproses) {
      System.out.println("Peminjaman " + getIdTransaksi() + " sudah diproses.");
      return;
    }
    System.out.println("\n=== PEMINJAMAN " + getIdTransaksi() + " ===");
    tampilkanPihak();
    if (buku.kurangiStok(1)) {
      aktif = true;
      sudahDiproses = true;
      System.out.println("Berhasil meminjam " + buku.getJudul() + " selama " + lamaHari + " hari.");
    } else {
      System.out.println("Peminjaman gagal: stok buku kosong.");
    }
  }
}
