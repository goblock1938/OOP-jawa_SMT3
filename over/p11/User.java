import java.util.Objects;

public class User {
  private String id;
  private String phone;
  private String username;
  private String password;

  public User() {
  }

  public User(String username, String password) {
    this(username, password, null);
  }

  public User(String username, String password, String phone) {
    this.username = username;
    this.password = password;
    this.phone = phone;
  }

  public boolean login(String usernameOrPhone, String password) {
    return usernameOrPhone != null
        && password != null
        && Objects.equals(this.password, password)
        && (Objects.equals(this.username, usernameOrPhone)
            || Objects.equals(this.phone, usernameOrPhone));
  }
}
