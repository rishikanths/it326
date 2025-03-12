package SOLID.SRP.BadPractise;

public class Driver {
    
    public static void main(String[] args) {
        User currentUser = new User("Rishi", "Kanth", "rsaripa@ilstu.edu", "rsaripa", "test");
        currentUser.sendEmail("rsaripa@ilstu.edu","Hello", "Test SOLID");
    }

}
