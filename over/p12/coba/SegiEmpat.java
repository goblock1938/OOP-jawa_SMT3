package over.p12.coba;

import java.awt.Point;

public class SegiEmpat {
  int x1 = 0;
  int y1 = 0;
  int x2 = 0;
  int y2 = 0;

  public void buatSegiempat(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public void buatSegiempat(Point topLeft, Point bottomRight) {
    x1 = topLeft.x;
    y1 = topLeft.y;
    x2 = bottomRight.x;
    y2 = bottomRight.y;
  }

  public void buatSegiempat(Point topLeft, int w, int h) {
    x1 = topLeft.x;
    y1 = topLeft.y;
    x2 = (x1 + w);
    y2 = (y1 + h);
  }

  void cetakSegiempat() {
    System.out.print("Segiempat: <" + x1 + ", " + y1);
    System.out.println(", " + x2 + ", " + y2 + ">");
  }

}
