package advanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String filename) {
        System.out.println("文件名："+filename+"   类型Vlc");
    }

    @Override
    public void playMp4(String filename) {

    }
}
