package patterns.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        
        Subject newSubject = new FlashNews();
        newSubject.register(new ConsoleObserver("console"));
        newSubject.register(new FileObserver("file"));

        newSubject.post("Hello IT326");
        newSubject.post("This is observer pattern");
    }
}
