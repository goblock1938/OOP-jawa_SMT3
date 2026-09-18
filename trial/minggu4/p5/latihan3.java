package trial.minggu4.p5;

public class latihan3 {
  public static void main() {
    latihan3 e = new latihan3();
    // melaksanakan sebuah construktor tanpa menggunakan variable nya
  }

  latihan3() {
    String s1 = "Java";
    String s2 = "Java";
    String s3 = "java";

    if (s1 == s2) // compare alokasi data, bukan compare value
      System.out.println("Equal"); // hasil akan equal karena mereka assignment dengan value yang sama tanpa
                                   // menggunakan construktor
    else
      System.out.println("Not equal");

    if (s1 == s3)
      System.out.println("Equal");
    else
      System.out.println("Not equal");
  }
}
