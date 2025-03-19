package patterns.structural.Bridge.devices;

public class Radio extends AbstractDevice{

    public Radio(String name){
        this.name = name;
    }
    @Override
    public boolean on() {
        powered = true;
        return powered;
    }
    @Override
    public boolean off() {
        powered = false;
        return powered;
    }
    @Override
    public boolean setVolume(int percent) {
        volume+=percent;
        return true;
    }
    @Override
    public boolean setChannel(int channel) {
        this.channel = channel;
        return true;
    }
   
}
