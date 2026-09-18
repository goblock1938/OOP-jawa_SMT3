package trial.minggu4.p5;

public class compString {
  public static void main() {
    String str1 = "PENS";
    String str2 = "pens";

    System.out.println(str1.equals(str2)); // compare case sensitive
    System.out.println(str1.equalsIgnoreCase(str2)); // compare case insensitive
  }
}
