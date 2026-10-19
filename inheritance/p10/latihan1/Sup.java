package inheritance.p10.latihan1;

public class Sup extends Base {
  public static void main(String argv[]) {
    Sup s = new Sup();
  }

  Sup() {
    // memanggil class parent menggunakan super()
    // super();
    // jikalau menggunakan super tanpa parameter maka tidak terjadi apa apa karena
    // construktor dari class nya tidak menjalankan apa - aoa
    super(1); // jikalau menggunakan paramter dia akan menjalankan println nya
  }

  public void derived() {
  }
}
