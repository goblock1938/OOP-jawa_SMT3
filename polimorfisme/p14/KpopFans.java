package polimorfisme.p14;

public class KpopFans extends Fans {
  public KpopFans() {
  }

  public KpopFans(String name) {
    super(name);
  }

  public void watchingPerformance(Kpop kpop, String keadaan) {
    super.showName();
    System.out.println(
        keadaan + " melihat idolanya beraksi di atas panggung, bernyanyi dengan merdudan ngedance");

  }

  public void watchingPerformances(Musician musician, String expression) {
    super.showName();
    System.out.println(expression + " melihat idolanya beraksi di atas panggung");
  }

}
