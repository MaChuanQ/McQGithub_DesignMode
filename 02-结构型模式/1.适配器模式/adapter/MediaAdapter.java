package adapter;

import advanceMediaPlayer.AdvanceMediaPlayer;
import advanceMediaPlayer.Mp4Player;
import advanceMediaPlayer.VlcPlayer;
import mediaPlayer.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        }else if (mediaType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String mediaType, String filename) {
        if (mediaType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(filename);
        }else if (mediaType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(filename);
        }
    }
}
