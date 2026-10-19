package inheritance.p10.tugas;

public class Tes {
  public static void main(String[] args) {
    // --- TRUK 1 ---
    Truk truk1 = new Truk();
    truk1.setJmlRoda(4);
    truk1.setWarna("kuning");
    truk1.setBahanBakar("solar");
    truk1.setKapasitasMesin(1500);
    truk1.setMuatanMaks(1000);

    // --- TRUK 2 ---
    Truk truk2 = new Truk();
    truk2.setJmlRoda(6);
    truk2.setWarna("merah");
    truk2.setBahanBakar("solar");
    truk2.setKapasitasMesin(2000);
    truk2.setMuatanMaks(5000);

    // --- TAKSI 1 ---
    Taksi taksi1 = new Taksi();
    taksi1.setJmlRoda(4);
    taksi1.setWarna("oranye");
    taksi1.setBahanBakar("bensin");
    taksi1.setKapasitasMesin(1500);
    taksi1.setTarifAwal(10000);
    taksi1.setTarifPerKm(5000);

    // --- TAKSI 2 ---
    Taksi taksi2 = new Taksi();
    taksi2.setJmlRoda(4);
    taksi2.setWarna("biru");
    taksi2.setBahanBakar("bensin");
    taksi2.setKapasitasMesin(1300);
    taksi2.setTarifAwal(7000);
    taksi2.setTarifPerKm(3500);

    // --- SEPEDA 1 ---
    Sepeda sepeda1 = new Sepeda();
    sepeda1.setJmlRoda(3);
    sepeda1.setWarna("hitam");
    sepeda1.setJmlSadel(1);
    sepeda1.setJmlGir(2);

    // --- SEPEDA 2 ---
    Sepeda sepeda2 = new Sepeda();
    sepeda2.setJmlRoda(2);
    sepeda2.setWarna("putih");
    sepeda2.setJmlSadel(2);
    sepeda2.setJmlGir(5);

    // --- MENAMPILKAN DATA OBYEK ---
    System.out.println("=== DATA TRUK ===");
    System.out.println("Truk 1 : Roda=" + truk1.getJmlRoda() + ", Warna=" + truk1.getWarna() +
        ", BBM=" + truk1.getBahanBakar() + ", Mesin=" + truk1.getKapasitasMesin() +
        " cc, Muatan Maks=" + truk1.getMuatanMaks() + " kg");
    System.out.println("Truk 2 : Roda=" + truk2.getJmlRoda() + ", Warna=" + truk2.getWarna() +
        ", BBM=" + truk2.getBahanBakar() + ", Mesin=" + truk2.getKapasitasMesin() +
        " cc, Muatan Maks=" + truk2.getMuatanMaks() + " kg\n");

    System.out.println("=== DATA TAKSI ===");
    System.out.println("Taksi 1: Roda=" + taksi1.getJmlRoda() + ", Warna=" + taksi1.getWarna() +
        ", BBM=" + taksi1.getBahanBakar() + ", Mesin=" + taksi1.getKapasitasMesin() +
        " cc, Tarif Awal=Rp" + taksi1.getTarifAwal() + ", Tarif/Km=Rp" + taksi1.getTarifPerKm());
    System.out.println("Taksi 2: Roda=" + taksi2.getJmlRoda() + ", Warna=" + taksi2.getWarna() +
        ", BBM=" + taksi2.getBahanBakar() + ", Mesin=" + taksi2.getKapasitasMesin() +
        " cc, Tarif Awal=Rp" + taksi2.getTarifAwal() + ", Tarif/Km=Rp" + taksi2.getTarifPerKm() + "\n");

    System.out.println("=== DATA SEPEDA ===");
    System.out.println("Sepeda 1: Roda=" + sepeda1.getJmlRoda() + ", Warna=" + sepeda1.getWarna() +
        ", Sadel=" + sepeda1.getJmlSadel() + ", Gir=" + sepeda1.getJmlGir());
    System.out.println("Sepeda 2: Roda=" + sepeda2.getJmlRoda() + ", Warna=" + sepeda2.getWarna() +
        ", Sadel=" + sepeda2.getJmlSadel() + ", Gir=" + sepeda2.getJmlGir());
  }
}
