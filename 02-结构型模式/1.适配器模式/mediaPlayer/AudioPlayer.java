package mediaPlayer;

import adapter.MediaAdapter;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String mediaType, String filename) {
        if (mediaType.equalsIgnoreCase("mp3")) {
            System.out.println("我可以播放mp3类型的媒体,默认支持......");
        }else if (mediaType.equalsIgnoreCase("vlc") || mediaType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType, filename);
        }else{
            System.out.println(mediaType+"类型不支持......");
        }
    }
}
