package trial.minggu4.p6;

public class Alarm {
  public String id;
  public String desc;
  public String date;
  public String time;

  public void run() {
    System.out.println("Alarm " + id + " berbunyi: " + desc);
  }

  public void terminate() {
    System.out.println("Alarm " + id + " dimatikan.");
  }

  public void snooze() {
    System.out.println("Alarm " + id + " ditunda (snooze).");
  }
}
