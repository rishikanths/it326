package SOLID.LSP.GoodPractise.MediaPlayer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AudioPlayer extends GeneralMediaPlayer {
    
    private static final Logger logger = Logger.getLogger(AudioPlayer.class.getName());

    @Override
    public void playAudio() {
        try {
            logger.log(Level.INFO, "Audioplayer Played Audio");
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
    }
}
