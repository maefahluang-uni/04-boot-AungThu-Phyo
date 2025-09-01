package th.mfu.boot;

public class User {
//     username: a unique identifier for the user
// displayname: the user's first and last name
// email: the user's email address
    private String username;
    private String displayname;
    private String email;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getDisplayname() {
        return displayname;
    }
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    

    
}