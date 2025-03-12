package SOLID.LSP.GoodPractise.MediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        List < GeneralMediaPlayer > allPlayers = new ArrayList<>();
        allPlayers.add(new VLCMediaPlayer());
        allPlayers.add(new AudioPlayer());

        playAudioInAllMediaPlayers(allPlayers);

        List < VideoMediaPlayer > videpPlayers = new ArrayList<>();
        allPlayers.add(new VLCMediaPlayer());

        playVideoInAllMediaPlayers(videpPlayers);
    }

    public static void playAudioInAllMediaPlayers(List < GeneralMediaPlayer > allPlayers) {

        for (GeneralMediaPlayer player: allPlayers) {
            player.playAudio();
        }
    }

    public static void playVideoInAllMediaPlayers(List <VideoMediaPlayer> allPlayers) {
        for (VideoMediaPlayer player: allPlayers) {
                player.playVideo();
        }
    }
}