package polimorfisme.p13.coba;

public class Tes {
  public static void main(String args[]) {
    Parent tes = new Child();
    System.out.println("Nilai x = " + tes.x);
    tes.Info();
  }
}
