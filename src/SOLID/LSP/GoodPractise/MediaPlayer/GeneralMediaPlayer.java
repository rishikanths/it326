package SOLID.LSP.GoodPractise.MediaPlayer;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * The base class for a player. The Base class assumes that all media players
 * will only play the audio
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
}