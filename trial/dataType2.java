package trial;

public class dataType2 {
  public static void main(String[] args) {
    // variable bisa di deklarasi
    // tanpa isi dari variable
    String nama;
    nama = "Neo Fahimanda";

    System.out.println(nama);

    // type data otomatis (var)
    // var harus langsung di isi
    // ketika awal deklarasi
    var age = 19;

    System.out.println("umur : " + age);

    // data final
    // mirip dengan const di JS
    final var angkatan = 2025;

    System.out.println("Angkatan : " + angkatan);

    // type data primitive
    // seperti :
    // byte => Byte
    // short => Short
    // int => Integer
    // long => Long
    // float => Float
    // double => Double
    // char => Character
    // boolean => Boolean
    // kiri primitive, kanan non primitive
    // untuk non primitive memiliki nilai default NULL
    // sedangkan primitive memiliki nilai default masing-masing

    byte bite = 0;
    Byte bite1 = null;

    short kecil = 0;
    Short kecil1 = null;

    int nomor = 0;
    Integer nomor1 = null;

    long panjang = 0;
    Long panjang1 = null;

    float desimal = 0;
    Float desimal1 = null;

    double despanjang = 0;
    Double despanjang1 = null;

    char huruf = '0';
    Character huruf1 = null;

    boolean bool = false;
    Boolean bool1 = null;

    System.out.println(bite);
    System.out.println(bite1);

    System.out.println(kecil);
    System.out.println(kecil1);

    System.out.println(nomor);
    System.out.println(nomor1);

    System.out.println(panjang);
    System.out.println(panjang1);

    System.out.println(desimal);
    System.out.println(desimal1);

    System.out.println(despanjang);
    System.out.println(despanjang1);

    System.out.println(huruf);
    System.out.println(huruf1);

    System.out.println(bool);
    System.out.println(bool1);

    // konversi non primitive ke primitive menggunakan method
    // (beda type data)

    nomor1 = 10;

    kecil = nomor1.shortValue();

    System.out.println(kecil);
  }
}
