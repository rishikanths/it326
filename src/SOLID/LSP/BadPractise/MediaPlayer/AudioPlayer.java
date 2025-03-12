package SOLID.LSP.BadPractise.MediaPlayer;

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

    /**
     * Play video is not supported.
     * You will have throw an exception as this operation
     * cannot be done by this class.
     * This class doesnt support the parent class behavior
     */
    @Override
    public void playVideo() {
        throw new UnsupportedOperationException("Feature not supported");
    }
}
