import java.applet.*;
import java.awt.*;
import java.net.URL;

public class Program2 extends Applet {
    Image img;
    AudioClip audio;

    public void init() {
        try {
            // Load image and audio
            img = getImage(getDocumentBase(), "Cat03.jpg");

            audio = getAudioClip(getDocumentBase(), "audio.wav");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start() {
        if (audio != null) {
            audio.play();
        }
    }

    public void paint(Graphics g) {
        if (img != null) {
            g.drawImage(img, 10, 10, 500, 500, this);
        }
    }
}
