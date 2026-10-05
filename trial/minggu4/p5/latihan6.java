
package trial.minggu4.p5;

public class latihan6 {
  public static void main() {
    String str = "Java";

    StringBuffer buffer = new StringBuffer(str);

    if (str.equals(buffer))
      System.out.println("Both are equal");
    else
      System.out.println("Both are not equal");
    // not equal karena berbeda memory
  }
}
