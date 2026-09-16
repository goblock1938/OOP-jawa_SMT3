package trial.minggu3.p4;

public class latihan1 {
  public static void main() {
    String nama[] = new String[4];
    double nilai[][] = new double[4][3];
    nama[0] = "Ahmad";
    nama[1] = "Adang";
    nama[2] = "Dani";
    nama[3] = "Edi";
    nilai[0][0] = 81;
    nilai[0][1] = 90;
    nilai[0][2] = 62;
    nilai[1][0] = 50;
    nilai[1][1] = 83;
    nilai[1][2] = 87;
    nilai[2][0] = 89;
    nilai[2][1] = 55;
    nilai[2][2] = 65;
    nilai[3][0] = 77;
    nilai[3][1] = 70;
    nilai[3][2] = 92;

    System.out.println("NRP\tNama Mhs\tRPL\t\tBD\t\tPBO");
    for (int i = 0; i < 4; i++)
      System.out.printf("%d\t%s\t\t%f\t%f\t%f\n", i + 1, nama[i], nilai[i][0], nilai[i][1], nilai[i][2]);

    System.out.println("NRP Rata-Rata");
    for (int i = 0; i < 4; i++)
      System.out.printf("%3d %9.4f\n", i + 1, (nilai[i][0] + nilai[i][1] + nilai[i][2]) / 3);
  }
}
