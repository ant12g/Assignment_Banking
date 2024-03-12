package Banking;

public class Admin {
    private String username;
    private String email;
    private String phone;
    private int id;

    public Admin(String username, String email, String phone, int id) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
