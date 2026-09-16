package trial.minggu3.p4;

public class tugas3 {
  public static void main() {
    int x[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int i = 0; i < 10; i++)
      System.out.println("Count is: " + x[i]);

    for (int item : x)
      System.out.println("Count is: " + item);
  }
}
