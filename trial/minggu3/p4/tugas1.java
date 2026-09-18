package trial.minggu3.p4;

public class tugas1 {
  public static void main(String[] args) {
    int[][] arrayOfInts = {
        { 32, 87, 3, 589 },
        { 12, 1076, 2000, 8 },
        { 622, 127, 77, 955 }
    };

    int searchFor = 12; // mencari data
    int rowFound = -1; // diisi nilai agar bisa di rubah setelah di temukannya data
    int colFound = -1;
    boolean found = false; // statement untuk data

    searchLoop: for (int i = 0; i < arrayOfInts.length; i++) {
      for (int j = 0; j < arrayOfInts[i].length; j++) {
        if (arrayOfInts[i][j] == searchFor) {
          found = true;
          rowFound = i;
          colFound = j;
          break searchLoop; // Menghentikan kedua loop sekaligus menggunakan label
        }
      }
    }

    if (found) {
      System.out.println("Found " + searchFor + " at " + rowFound + ", " + colFound);
    } else {
      System.out.println(searchFor + " not found in the array");
    }
  }
}
