public class User {

    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void changeName(String newName) {
        userName = "Name";
    }
}
