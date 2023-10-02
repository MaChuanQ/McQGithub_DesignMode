package advanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("文件名："+filename+"   类型Mp4");
    }
}
