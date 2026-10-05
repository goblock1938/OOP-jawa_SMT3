package trial.minggu4.p5;

import java.util.Scanner;

public class tugas4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("String nama pertama : ");
    String namaPertama = scanner.nextLine().trim(); // trim digunakan untuk menghilangkan spasi yang berlebih

    System.out.print("String nama kedua   : ");
    String namaKedua = scanner.nextLine().trim();

    // mencari index dari ' ' untuk mengetahui posisi mereka
    int lastSpaceIndex1 = namaPertama.lastIndexOf(' ');
    int lastSpaceIndex2 = namaKedua.lastIndexOf(' ');

    if (lastSpaceIndex1 == -1 || lastSpaceIndex2 == -1) { // jikalau input hanya berupa 1 kata saja
      System.out.println("Error: Kedua nama harus memiliki minimal dua kata (nama depan dan nama belakang).");
      scanner.close();
      return;
    }

    String depan1 = namaPertama.substring(0, lastSpaceIndex1); // nama depan dari depan menuju index dari ' '
    String family1 = namaPertama.substring(lastSpaceIndex1 + 1); // nama belakang dari index ' ' ke paling akhir

    String depan2 = namaKedua.substring(0, lastSpaceIndex2);
    String family2 = namaKedua.substring(lastSpaceIndex2 + 1);

    String hasilPertama = depan1 + " " + family2; // concat String dengan penengah ' '
    String hasilKedua = depan2 + " " + family1;

    System.out.println("\nOutput :");
    System.out.println("String nama pertama : " + hasilPertama);
    System.out.println("String nama kedua   : " + hasilKedua);

    scanner.close();
  }
}
