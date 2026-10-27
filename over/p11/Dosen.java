import java.util.Objects;

public class Dosen extends User {
  private String pangkat;
  private String golongan;
  private String key;

  public Dosen() {
    super();
  }

  public Dosen(String username, String password) {
    super(username, password);
  }

  public Dosen(String username, String password, String key) {
    super(username, password);
    this.key = key;
  }

  @Override
  public boolean login(String usernameOrPhone, String password) {
    return super.login(usernameOrPhone, password);
  }

  public boolean login(String usernameOrPhone, String password, String key) {
    return key != null
        && Objects.equals(this.key, key)
        && super.login(usernameOrPhone, password);
  }
}
