package polimorfisme.p14;

public class Fans {
  private String name;

  public Fans() {
  }

  public Fans(String name) {
    this.name = name;
  }

  public void showName() {
    if (this.name == null) {
      System.out.print("noname : ");
      return;
    }
    System.out.print(name + " : ");
  }

  public void watchingPerformance() {
    showName();
    System.out.println("melihat idolanya dari youtube");
  }

  public void watchingPerformance(Musician musician) {
    showName();
    System.out.println("melihat idolanya beraksi di atas panggung");
  }

  public void watchingPerformance(Singer Singer) {
    showName();
    System.out.println("melihat idolanya beraksi di atas panggung, bernyanyi dengan merdu");
  }

  public void watchingPerformance(Biduan biduan) {
    showName();
    System.out
        .println(
            "melihat idolanya beraksi di atas panggung, bernyanyi dengan merdu, dengan cengkok melayu");

  }

  public void watchingPerformances() {
    watchingPerformance();
  }

  public void watchingPerformances(Musician musician) {
    watchingPerformance(musician);
  }
}
