public class Credentials {
  private String username, password;
  public Credentials(String userId, String uniqueId) {
    username = userId;
    password = uniqueId;
  }

  public String getUsername() {
      return username;
  }

  public String getPassword() {
    return password;
  }

}