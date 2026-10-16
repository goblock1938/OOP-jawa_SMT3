package UTS;

public class Pesanan extends Transaksi {
  private Buku bukuDibeli;
  private int jumlahBeli;
  private double totalHarga;

  public Pesanan(String idTransaksi, Anggota anggota, Petugas petugas, Buku bukuDibeli, int jumlahBeli) {
    super(idTransaksi, anggota, petugas);
    this.bukuDibeli = bukuDibeli;
    this.jumlahBeli = jumlahBeli;
    this.totalHarga = bukuDibeli.getHargaJual() * jumlahBeli;
  }

  @Override
  public void prosesTransaksi() {
    System.out.println("\n--- PROSES PESANAN PEMBELIAN BUKU ---");
    System.out.println("ID Transaksi : " + idTransaksi);
    anggota.tampilkanInfoAnggota();
    petugas.infoPetugas();
    System.out.println("Buku Dibeli  : " + bukuDibeli.getJudul() + " (" + jumlahBeli + " pcs)");

    if (bukuDibeli.getStok() >= jumlahBeli) {
      bukuDibeli.kurangiStok(jumlahBeli);
      this.pembayaran = new Pembayaran("PAY-ORD-" + idTransaksi, totalHarga, "QRIS / Transfer");
      System.out.println("Status       : Pembelian Buku Berhasil!");
      pembayaran.cetakStrukPembayaran();
    } else {
      System.out.println("Status       : Gagal, Stok Toko Tidak Mencukupi!");
    }
  }
}
