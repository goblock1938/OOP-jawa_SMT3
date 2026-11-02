package polimorfisme.p13.latihan1.child;

public class SubclassY extends SuperclassX {
  SuperclassX objX = new SubclassY();
  SubclassY objY = new SubclassY();

  void subclassMethodY() {
    objY.superclassMethodX();
    int i;
    i = objY.superclassVarX;
  }
}
