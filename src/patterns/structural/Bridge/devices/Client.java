package patterns.structural.Bridge.devices;

public class Client {
    public static void main(String[] args) {
       
        AbstractDevice device = new Radio("MyRadio");
        AbstractRemote basicRemote = new BasicRemote(device);
        device.status();
        basicRemote.power();
        basicRemote.channelDown();
    }
}
