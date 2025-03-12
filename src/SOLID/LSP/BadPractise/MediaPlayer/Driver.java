package SOLID.LSP.BadPractise.MediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        List < GeneralMediaPlayer > allPlayers = new ArrayList<GeneralMediaPlayer>();
        allPlayers.add(new VLCMediaPlayer());
        allPlayers.add(new AudioPlayer());

        /**
         * This method will throw an exception as an object of AudioPlayer
         * cannot object of GeneralPlayer -as AudioPLayer doesnt support playVideo
         */
        playVideoInAllMediaPlayers(allPlayers);

        /**
         * To avoid the exception, you can do something like an IF then ELSE
         * You can the type of object before calling the method. 
         * This violates OCP as you have keeping on changing the code when the a 
         * child class of GeneralMediaPlayer cannot fulfill a behavior of the parent  
         */
        playVideo(allPlayers);
    }

    /**
     * This method is playing video in all players
     * 
     * @param allPlayers
     */
    public static void playVideoInAllMediaPlayers(List < GeneralMediaPlayer > allPlayers) {

        for (GeneralMediaPlayer player: allPlayers) {
            player.playVideo();
        }
    }

    public static void playVideo(List < GeneralMediaPlayer > allPlayers) {

        for (GeneralMediaPlayer player: allPlayers) {
            if (! (player instanceof AudioPlayer))
                player.playVideo();
        }
    }
}