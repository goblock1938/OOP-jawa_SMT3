package over.p12.latihan2;

public class MySomeOne {
  public static void main(String args[]) {
    MyChild myChi = new MyChild(10, 20, 30);
    MyParent myPar = new MyParent(10, 20);

    int x = myChi.addMe(10, 20, 30);
    int y = myChi.addMe(myChi);
    int z = myPar.addMe(myPar);

    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(x + y + z);
  }
}
