package patterns.structural.Bridge.devices;

public abstract class AbstractRemote {
    
    protected AbstractDevice device = null;
    
    public abstract void power();

    public abstract void volumeDown();

    public abstract void volumeUp();

    public abstract void channelDown();

    public abstract void channelUp();
}
