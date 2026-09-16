package trial.minggu3.p4;

public class tugas1 {
  public static void main(String[] args) {
    int[][] arrayOfInts = {
        { 32, 87, 3, 589 },
        { 12, 1076, 2000, 8 },
        { 622, 127, 77, 955 }
    };

    int searchFor = 12;
    int rowFound = -1;
    int colFound = -1;
    boolean found = false;

    searchLoop: for (int i = 0; i < arrayOfInts.length; i++) {
      for (int j = 0; j < arrayOfInts[i].length; j++) {
        if (arrayOfInts[i][j] == searchFor) {
          found = true;
          rowFound = i;
          colFound = j;
          break searchLoop; // Menghentikan kedua loop sekaligus
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
