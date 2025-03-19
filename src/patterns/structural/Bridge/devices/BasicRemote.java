package patterns.structural.Bridge.devices;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BasicRemote extends AbstractRemote{

    private static final Logger logger = Logger.getLogger(BasicRemote.class.getSimpleName());
    public BasicRemote(AbstractDevice device) {
        this.device = device;
    }

    @Override
    public void power() {
        logger.log(Level.INFO,"Power Toggle");
        if (!device.isOn()) {
            device.on();
        } else {
            device.off();
        }
    }

    @Override
    public void volumeDown() {
        if(device.getVolume()<=0){
            device.setVolume(device.getVolume() - 1);
            logger.log(Level.INFO,"Reduce Volume for {}",device.status());
        }    
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 2);
        logger.log(Level.INFO,"Increase Volume for {}",device.status());
    }

    @Override
    public void channelDown() {
        if(device.getChannel()>0){
            device.setVolume(device.getVolume() - 1);
            logger.log(Level.INFO,"Reduce Channel for {0}",device.status());
        }else{
            logger.log(Level.WARNING,"Channel is already at 0. {0}",device.status());
        }
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel()+1);
        logger.log(Level.INFO,"Increase Channel for {%s}",device.status());
    }
}
