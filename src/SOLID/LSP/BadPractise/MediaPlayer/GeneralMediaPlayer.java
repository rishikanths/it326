package SOLID.LSP.BadPractise.MediaPlayer;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * The base class for a player. The Base class assumes that all media players
 * can play both audio and video.
 */
public class GeneralMediaPlayer {

    private static final Logger logger = Logger.getLogger(GeneralMediaPlayer.class.getName());
    
    public void playAudio() {
        try {
            logger.log(Level.INFO,"Played Audio");
        } catch (Exception e) {
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
    }

    // Play video implementation
    public void playVideo() {
        try {
            logger.log(Level.INFO,"Played Video");
        } catch (Exception e) {
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
    }
}