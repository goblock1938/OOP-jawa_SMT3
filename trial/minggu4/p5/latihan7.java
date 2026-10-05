package trial.minggu4.p5;

public class latihan7 {
  public static void main() {
    String str1 = "abc";
    String str2 = "def";

    String str3 = str1.concat(str2); // memakai method menggunakan assignment

    str1.concat(str2); // memakai method tanpa assignment

    System.out.println(str1);
    System.out.println(str3);
  }
}
