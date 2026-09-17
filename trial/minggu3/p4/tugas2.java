package trial.minggu3.p4;

public class tugas2 {
  public static void main() {
    int jumlah = 0;
    char[] matKul = { 'p', 'e', 'm', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'n', 'b', 'e', 'r', 'b', 'a', 's', 'i', 's',
        'o', 'b', 'y', 'e', 'k' };

    // menggunakan for each untuk menghitung char
    for (char mat : matKul) {
      if (mat != 'a')
        continue;
      jumlah++;
    }

    System.out.println(jumlah);
  }
}
