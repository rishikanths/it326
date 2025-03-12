package SOLID.LSP.BadPractise.MediaPlayer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VLCMediaPlayer extends GeneralMediaPlayer {
    
    private static final Logger logger = Logger.getLogger(VLCMediaPlayer.class.getName());
  
    @Override
    public void playAudio() {
        try {
            logger.log(Level.INFO,"VLC MediaPlayer Played Audio");
        } catch (Exception e) {
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
    }

    @Override
    public void playVideo() {
        try {
            logger.log(Level.INFO,"VLC MediaPlayer Played Video");
        } catch (Exception e) {
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
    }
}
