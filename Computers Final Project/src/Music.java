import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Music {
    private Clip clip;
    private int x = 0;
    private boolean isplaying = false;

    public void resetall() {
        x = 0;
        isplaying = false;
    }

    public void startMusic() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream("res\\music.wav")));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        this.playMusic();
    }

    public void stopMusic() {
        try {
            x = clip.getFramePosition();
            clip.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        isplaying = false;
    }

    public void playMusic() {
        clip.setFramePosition((x % clip.getFrameLength()));
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        isplaying = true;
    }
}

