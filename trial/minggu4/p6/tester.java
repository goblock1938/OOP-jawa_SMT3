package trial.minggu4.p6;

public class tester {
  public static void main(String[] args) {
    Shape kubus = new Shape(5, 5, 5);
    Shape balok = new Shape(10, 5, 5);

    kubus.cetak();
    balok.cetak();

    Double selisihVolume = kubus.compareTo(balok);
    System.out.println("Selisih Volume = " + selisihVolume.intValue());
  }
}
