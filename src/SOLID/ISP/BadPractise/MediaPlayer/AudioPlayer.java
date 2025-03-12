package SOLID.ISP.BadPractise.MediaPlayer;

public class AudioPlayer implements MPInterface {

    /**
     * Play video is not supported in Winamp player.
     * You will have throw an exception as this operation 
     * cannot be done by audio players - NOT GOOD
     */
    @Override
    public void playVideo() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void playAudio() {
        // Logic to play audio
    }
}
