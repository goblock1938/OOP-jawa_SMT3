package over.p12.tugas1;

public class RerataNilai {
  public int average(int nilai1, int nilai2) {
    return (int) (((long) nilai1 + nilai2) / 2);
  }

  public double average(double nilai1, double nilai2) {
    return (nilai1 + nilai2) / 2;
  }

  public int average(int nilai1, int nilai2, int nilai3) {
    return (int) (((long) nilai1 + nilai2 + nilai3) / 3);
  }
}
