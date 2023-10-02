import mediaPlayer.AudioPlayer;

public class AdapterModeDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4","你好.mp4");
        audioPlayer.play("vlc","我不好.vlc");
        audioPlayer.play("avi","我很不好.avi");
    }
}
