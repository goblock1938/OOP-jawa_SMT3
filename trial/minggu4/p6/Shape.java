package trial.minggu4.p6;

public class Shape {
  public double length;
  public double width;
  public double height;
  public double volume;

  public Shape(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
    calculateVolume();
  }

  private void calculateVolume() {
    this.volume = length * width * height;
  }

  public double compareTo(Shape param1) {
    return Math.abs(this.volume - param1.volume);
  }

  public void cetak() {
    System.out.println("Panjangxlebarxtinggi = " + (int) length + "x" + (int) width + "x" + (int) height);
    System.out.println("Volume = " + (int) volume);
  }
}
