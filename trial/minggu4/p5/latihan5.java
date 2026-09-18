package trial.minggu4.p5;

public class latihan5 {
  public static void main() {
    latihan5 e = new latihan5();
  }

  latihan5() {
    String s = "Java";
    String s2 = "java";

    if (s.equalsIgnoreCase(s2))
      System.out.println("Equal");
    else
      System.out.println("Not equal");

  }
}
