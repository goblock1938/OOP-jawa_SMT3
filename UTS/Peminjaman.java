package UTS;

public class Peminjaman extends Transaksi {
  private Buku bukuDipinjam;
  private int lamaHari;

  public Peminjaman(String idTransaksi, Anggota anggota, Petugas petugas, Buku bukuDipinjam, int lamaHari) {
    super(idTransaksi, anggota, petugas);
    this.bukuDipinjam = bukuDipinjam;
    this.lamaHari = lamaHari;
  }

  @Override
  public void prosesTransaksi() {
    System.out.println("\n--- PROSES PEMINJAMAN BUKU ---");
    System.out.println("ID Transaksi : " + idTransaksi);
    anggota.tampilkanInfoAnggota();
    petugas.infoPetugas();
    System.out.println("Buku Dipinjam: " + bukuDipinjam.getJudul() + " selama " + lamaHari + " hari.");

    if (bukuDipinjam.getStok() > 0) {
      bukuDipinjam.kurangiStok(1);
      this.pembayaran = new Pembayaran("PAY-PIN-" + idTransaksi, 0.0, "Gratis/Peminjaman");
      System.out.println("Status       : Peminjaman Berhasil Disetujui!");
    } else {
      System.out.println("Status       : Gagal, Stok Buku Kosong!");
    }
    pembayaran.cetakStrukPembayaran();
  }
}
