import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Passive {
    private BeanCounter counter = new BeanCounter();
    private BufferedImage image1;
    private BufferedImage image2;
    private BufferedImage image3;
    private BufferedImage image4;
    private BufferedImage image5;
    private BufferedImage image6;
    private BufferedImage image7;
    private BufferedImage image8;
    private boolean small1 = false;
    private boolean small2 = false;
    private boolean small3 = false;
    private boolean small4 = false;
    private boolean small5 = false;
    private boolean small6 = false;
    private boolean small7 = false;
    private boolean small8 = false;
    private int passive1 = 0;
    private int passive2 = 0;
    private int passive3 = 0;
    private int passive4 = 0;
    private int passive5 = 0;
    private int passive6 = 0;
    private int passive7 = 0;
    private int passive8 = 0;
    private int passive1cost = 45;
    private int passive2cost = 225;
    private int passive3cost = 760;
    private int passive4cost = 2450;
    private int passive5cost = 11111;
    private int passive6cost = 25000;
    private int passive7cost = 42000;
    private int passive8cost = 99999;
    private int totalpassive = 0;

    public int getTotalpassive() {
        return totalpassive;
    }

    public int getPassive1cost() {
        return passive1cost;
    }

    public int getPassive2cost() {
        return passive2cost;
    }

    public int getPassive3cost() {
        return passive3cost;
    }

    public int getPassive4cost() {
        return passive4cost;
    }

    public int getPassive5cost() {
        return passive5cost;
    }

    public int getPassive6cost() {
        return passive6cost;
    }

    public int getPassive7cost() {
        return passive7cost;
    }

    public int getPassive8cost() {
        return passive8cost;
    }

    public int getPassive1() {
        return passive1;
    }

    public int getPassive2() {
        return passive2;
    }

    public int getPassive3() {
        return passive3;
    }

    public int getPassive4() {
        return passive4;
    }

    public int getPassive5() {
        return passive5;
    }

    public int getPassive6() {
        return passive6;
    }

    public int getPassive7() {
        return passive7;
    }

    public int getPassive8() {
        return passive8;
    }

    public void setPassive1(int passive1) {
        this.passive1 = passive1;
    }

    public void setPassive2(int passive2) {
        this.passive2 = passive2;
    }

    public void setPassive3(int passive3) {
        this.passive3 = passive3;
    }

    public void setPassive4(int passive4) {
        this.passive4 = passive4;
    }

    public void setPassive5(int passive5) {
        this.passive5 = passive5;
    }

    public void setPassive6(int passive6) {
        this.passive6 = passive6;
    }

    public void setPassive7(int passive7) {
        this.passive7 = passive7;
    }

    public void setPassive8(int passive8) {
        this.passive8 = passive8;
    }

    public void setSmall1(boolean small) {
        this.small1 = small;
    }

    public void setSmall2(boolean small2) {
        this.small2 = small2;
    }

    public void setSmall3(boolean small3) {
        this.small3 = small3;
    }

    public void setSmall4(boolean small4) {
        this.small4 = small4;
    }

    public void setSmall5(boolean small5) {
        this.small5 = small5;
    }

    public void setSmall6(boolean small6) {
        this.small6 = small6;
    }

    public void setSmall7(boolean small7) {
        this.small7 = small7;
    }

    public void setSmall8(boolean small8) {
        this.small8 = small8;
    }

    public void setPassive1cost(int passive1cost) {
        this.passive1cost = passive1cost;
    }

    public void setPassive2cost(int passive2cost) {
        this.passive2cost = passive2cost;
    }

    public void setPassive3cost(int passive3cost) {
        this.passive3cost = passive3cost;
    }

    public void setPassive4cost(int passive4cost) {
        this.passive4cost = passive4cost;
    }

    public void setPassive5cost(int passive5cost) {
        this.passive5cost = passive5cost;
    }

    public void setPassive6cost(int passive6cost) {
        this.passive6cost = passive6cost;
    }

    public void setPassive7cost(int passive7cost) {
        this.passive7cost = passive7cost;
    }

    public void setPassive8cost(int passive8cost) {
        this.passive8cost = passive8cost;
    }

    public void resetall() {
        small1 = false;
        small2 = false;
        small3 = false;
        small4 = false;
        small5 = false;
        small6 = false;
        small7 = false;
        small8 = false;
        passive1 = 0;
        passive2 = 0;
        passive3 = 0;
        passive4 = 0;
        passive5 = 0;
        passive6 = 0;
        passive7 = 0;
        passive8 = 0;
        passive1cost = 45;
        passive2cost = 225;
        passive3cost = 760;
        passive4cost = 2450;
        passive5cost = 11111;
        passive6cost = 25000;
        passive7cost = 42000;
        passive8cost = 99999;
        totalpassive = 0;
    }

    public Passive() {
        try {
            File passive1 = new File("res\\passive1.png");
            image1 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image1 = ImageIO.read(passive1);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File passive2 = new File("res\\passive2.png");
            image2 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image2 = ImageIO.read(passive2);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File passive3 = new File("res\\passive3.png");
            image3 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image3 = ImageIO.read(passive3);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File passive4 = new File("res\\passive4.png");
            image4 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image4 = ImageIO.read(passive4);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File passive5 = new File("res\\passive5.png");
            image5 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image5 = ImageIO.read(passive5);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File passive6 = new File("res\\passive6.png");
            image6 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image6 = ImageIO.read(passive6);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File passive7 = new File("res\\passive7.png");
            image7 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image7 = ImageIO.read(passive7);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File passive8 = new File("res\\passive8.png");
            image8 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image8 = ImageIO.read(passive8);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
    }

    public void passiveUpdate() {
        totalpassive = ((passive1) + (passive2 * 3) + (passive3 * 10) + (passive4 * 50) + (passive5 * 200) + (passive6 * 700) + (passive7 * 3000) + (passive8 * 13500));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        if (small1) {
            g2d.drawImage(image1, 344, 514, 54, 54, null);
        } else {
            g2d.drawImage(image1, 339, 509, 64, 64, null);
        }
        if (small2) {
            g2d.drawImage(image2, 472, 514, 54, 54, null);
        } else {
            g2d.drawImage(image2, 467, 509, 64, 64, null);
        }
        if (small3) {
            g2d.drawImage(image3, 600, 514, 54, 54, null);
        } else {
            g2d.drawImage(image3, 595, 509, 64, 64, null);
        }
        if (small4) {
            g2d.drawImage(image4, 728, 516, 54, 52, null);
        } else {
            g2d.drawImage(image4, 723, 511, 64, 62, null);
        }
        if (small5) {
            g2d.drawImage(image5, 344, 653, 54, 52, null);
        } else {
            g2d.drawImage(image5, 339, 648, 64, 62, null);
        }
        if (small6) {
            g2d.drawImage(image6, 469, 649, 54, 54, null);
        } else {
            g2d.drawImage(image6, 464, 644, 64, 64, null);
        }
        if (small7) {
            g2d.drawImage(image7, 600, 651, 54, 54, null);
        } else {
            g2d.drawImage(image7, 595, 646, 64, 64, null);
        }
        if (small8) {
            g2d.drawImage(image8, 728, 651, 54, 54, null);
        } else {
            g2d.drawImage(image8, 723, 646, 64, 64, null);
        }

    }
}
