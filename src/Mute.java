import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Mute {
    private boolean mutesound = false;
    private BufferedImage image1;

    public boolean isMutesound() {
        return mutesound;
    }

    public void setMutesound(boolean mutesound) {
        this.mutesound = mutesound;
    }

    public void resetall() {
        mutesound = false;
    }

    public Mute() {
        try {
            File bean1 = new File("res\\audio.png");
            image1 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image1 = ImageIO.read(bean1);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image1, 861, 499, 90, 100, null);
        if (mutesound) {
            g2d.setColor(Color.red);
            g2d.drawLine(856, 499, 955, 598);
            g2d.drawLine(955, 499, 856, 598);
        }
    }
}
