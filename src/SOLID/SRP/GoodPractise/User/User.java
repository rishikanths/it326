package SOLID.SRP.GoodPractise.User;

public class User {

    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String phone = "";
    private String userName = "";
    private String password = "";

    public User(String fName, String lName, String email, String phone, String userName, String password) {
        this.firstName = fName;
        this.lastName = lName;
        this.phone = phone;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
}
