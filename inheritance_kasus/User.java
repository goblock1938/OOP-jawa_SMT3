class User {
  String nama;
  String email;
  String status;

  User(String nama, String email) {
    this.nama = nama;
    this.email = email;
    this.status = "Aktif";
  }

  void tampilkanIdentitas() {
    System.out.println("Nama   : " + nama);
    System.out.println("Email  : " + email);
    System.out.println("Status : " + status);
  }

  void tampilkanPeran() {
    System.out.println("Peran  : User Umum");
  }
}
