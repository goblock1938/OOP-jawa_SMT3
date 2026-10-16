class Mahasiswa extends User {
  String nama;
  String nrp;
  String programStudi;

  Mahasiswa(String nama, String email, String nrp, String programStudi) {
    super(nama, email);
    this.nama = nama;
    this.nrp = nrp;
    this.programStudi = programStudi;
  }

  @Override
  void tampilkanPeran() {
    System.out.println("Peran  : Mahasiswa");
  }

  void tampilkanDataAkademik() {
    System.out.println("Nama pada Mahasiswa : " + nama);
    System.out.println("NRP                 : " + nrp);
    System.out.println("Program Studi       : " + programStudi);
  }
}
