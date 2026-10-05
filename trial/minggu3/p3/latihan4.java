package trial.minggu3.p3;

public class latihan4 {
  public static void main() {
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 1 || i % 6 == 0)
        continue;
      System.out.print(i + " ");
    }
  }
}
