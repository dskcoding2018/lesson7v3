package sample;

public class User {
  private String username, password;

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public User() {
    this.username = "John";
    this.password = "123456";
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean doLogin(String username, String password) {
    return this.username.equalsIgnoreCase(username) && this.password.equals(password);
  }
}
