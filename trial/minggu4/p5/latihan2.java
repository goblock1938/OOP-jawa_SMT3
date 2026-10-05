package trial.minggu4.p5;

public class latihan2 {
  public static void main(String args[]) {
    latihan2 c = new latihan2();
    String s = new String("ello");

    c.amethod(s);
  }

  public void amethod(String s) {
    String c = "H";
    c += s; // c => "H" + "ello" => "Hello"

    System.out.println(c);
  }
}
