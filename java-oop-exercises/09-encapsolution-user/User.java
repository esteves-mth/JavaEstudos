public class User {
    private String username;
    private String password;
    private boolean isLoggedIn;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String inputPassword) {  // ← Returns success/fail
        if (inputPassword.equals(this.password)) {
            isLoggedIn = true;
            return true;
        }
        return false;
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(this.password)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

    public boolean logout(){
        if (this.isLoggedIn == true){
            this.isLoggedIn = false;
            return true;
        }
    }

    public boolean isAuthenticated(){
        return this.isLoggedIn;
    }

    public String getUsername() {
        return this.username;
    }
}
