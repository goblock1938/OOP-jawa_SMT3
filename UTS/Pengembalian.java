package UTS;

public class Pengembalian extends Transaksi {
  private Peminjaman peminjaman;
  private boolean sudahDiproses;

  public Pengembalian(String idTransaksi, Peminjaman peminjaman, Petugas petugas) {
    super(idTransaksi, peminjaman.getAnggota(), petugas);
    this.peminjaman = peminjaman;
  }

  @Override
  public void prosesTransaksi() {
    System.out.println("\n=== PENGEMBALIAN " + getIdTransaksi() + " ===");
    tampilkanPihak();
    if (sudahDiproses || !peminjaman.prosesPengembalian()) {
      System.out.println("Pengembalian gagal: tidak ada peminjaman aktif.");
      return;
    }
    sudahDiproses = true;
    System.out.println("Buku berhasil dikembalikan.");
  }
}
