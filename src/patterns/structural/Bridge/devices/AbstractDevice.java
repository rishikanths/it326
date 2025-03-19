package patterns.structural.Bridge.devices;

public abstract class AbstractDevice {

    protected boolean powered = false;
    protected int volume = 0;
    protected int channel = 0;
    protected String name = "";

    public boolean isOn(){
        return powered;
    }
    
    public abstract boolean on();

    public abstract boolean off();

    public int getVolume(){return volume;}

    public abstract boolean setVolume(int percent);

    public abstract boolean setChannel(int channel);

    public int getChannel(){return channel;}

    public String status() {
        return name+" [powered=" + powered + ", volume=" + volume + ", channel=" + channel + "]";
    }
}
