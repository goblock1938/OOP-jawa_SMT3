package trial.minggu4.p5;

public class latihan4 {
  public static void main() {
    latihan4 e = new latihan4();

  }

  latihan4() {
    String s1 = new String("Java");
    String s2 = new String("Java");
    String s3 = new String("java");

    if (s1 == s2) // hasil akan not equal karena mereka alokasi memory yang berbeda dengan
                  // menggunakan construktor
      System.out.println("Equal");
    else
      System.out.println("Not equal");

    if (s1 == s3)
      System.out.println("Equal");
    else
      System.out.println("Not equal");

  }
}
