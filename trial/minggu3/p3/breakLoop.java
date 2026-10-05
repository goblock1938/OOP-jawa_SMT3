package trial.minggu3.p3;

public class breakLoop {
  public static void main() {
    int i = 0;
    do {
      System.out.println("Iterasi ke " + i);
      i++;
      if (i > 10)
        break;
    } while (true);
  }
}
