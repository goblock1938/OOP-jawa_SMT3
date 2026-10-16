class MahasiswaSDT extends Mahasiswa {
  String konsentrasi;
  int semester;

  MahasiswaSDT(String nama, String email, String nrp, String programStudi, String konsentrasi, int semester) {
    super(nama, email, nrp, programStudi);
    this.konsentrasi = konsentrasi;
    this.semester = semester;
  }

  @Override
  void tampilkanPeran() {
    System.out.println("Peran  : Mahasiswa SDT");
  }

  void tampilkanDetailSDT() {
    System.out.println("Konsentrasi : " + konsentrasi);
    System.out.println("Semester    : " + semester);
  }
}
