package trial.minggu3.p3;

public class whileLoop {
  public static void main() {
    int count = 1;
    int i = 0;
    while (i < 9) {
      int j = 0;
      while (j < i + 1) {
        System.out.print(count);
        j++;
      }
      count++;
      System.out.println();
      i++;

    }
  }
}
