package UTS;

public class Stok {
  private int jumlah;

  public Stok(int jumlah) {
    this.jumlah = jumlah;
  }

  public int getJumlah() {
    return jumlah;
  }

  public boolean kurangi(int jumlah) {
    if (jumlah <= 0 || this.jumlah < jumlah) {
      return false;
    }
    this.jumlah -= jumlah;
    return true;
  }

  public void tambah(int jumlah) {
    if (jumlah > 0) {
      this.jumlah += jumlah;
    }
  }
}
