package patterns.behavioral.mediator;

public interface AbstractMediator {

    public void sendMessage(String message, Aeroplane a);

    public void addPlane(Aeroplane a);

}
