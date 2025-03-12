package SOLID.SRP.GoodPractise.User;

public class Main {
    
    public static void main(String[] args) {
        User currentUser = new User("Rishi", "Kanth", "rsaripa@ilstu.edu", "3094383520", "rsaripa", "test");
        currentUser.setEmail("rishi.saripalle@ilstu.edu");

        Login loginService = new Login();
        if (loginService.login(currentUser)){
            Email.email(currentUser, "rsaripa@ilstu.edu","Hello", "SRP Test");
        }

    }

}
