import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bean {
    private BufferedImage image1;
    private BufferedImage image2;
    private BufferedImage image3;
    private BufferedImage image4;
    private BufferedImage image5;
    private BufferedImage image6;
    private BufferedImage image7;
    private BufferedImage image8;
    private BufferedImage image9;
    private BufferedImage image10;
    private BufferedImage image11;
    private boolean small = false;
    private int beanimage = 1;

    public int getBeanimage() {
        return beanimage;
    }

    public void setBeanimage(int beanimage) {
        this.beanimage = beanimage;
    }

    public void setSmall(boolean small) {
        this.small = small;
    }

    public void resetall() {
        beanimage = 1;
        small = false;
    }

    public Bean() {
        try {
            File bean1 = new File("res\\bean1.png");
            image1 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image1 = ImageIO.read(bean1);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File bean2 = new File("res\\bean2.png");
            image2 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image2 = ImageIO.read(bean2);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File bean3 = new File("res\\bean3.png");
            image3 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image3 = ImageIO.read(bean3);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File bean4 = new File("res\\bean4.png");
            image4 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image4 = ImageIO.read(bean4);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File bean5 = new File("res\\bean5.png");
            image5 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image5 = ImageIO.read(bean5);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File bean6 = new File("res\\bean6.png");
            image6 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image6 = ImageIO.read(bean6);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File bean7 = new File("res\\bean7.png");
            image7 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image7 = ImageIO.read(bean7);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File bean8 = new File("res\\bean8.png");
            image8 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image8 = ImageIO.read(bean8);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File bean9 = new File("res\\bean9.png");
            image9 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image9 = ImageIO.read(bean9);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File bean10 = new File("res\\bean10.png");
            image10 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image10 = ImageIO.read(bean10);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
        try {
            File bean11 = new File("res\\beangod.png");
            image11 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image11 = ImageIO.read(bean11);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        if (this.beanimage == 1) {
            if (small) {
                g2d.drawImage(image1, 365, 185, 246, 246, null);
            } else {
                g2d.drawImage(image1, 360, 180, 256, 256, null);
            }
            g2d.drawImage(image2, 80, 505, 128, 128, null);
        } else if (this.beanimage == 2) {
            if (small) {
                g2d.drawImage(image2, 365, 185, 246, 246, null);
            } else {
                g2d.drawImage(image2, 360, 180, 256, 256, null);
            }
            g2d.drawImage(image3, 80, 505, 128, 128, null);
        } else if (this.beanimage == 3) {
            if (small) {
                g2d.drawImage(image3, 365, 185, 246, 246, null);
            } else {
                g2d.drawImage(image3, 360, 180, 256, 256, null);
            }
            g2d.drawImage(image4, 80, 505, 128, 128, null);
        } else if (this.beanimage == 4) {
            if (small) {
                g2d.drawImage(image4, 365, 185, 246, 246, null);
            } else {
                g2d.drawImage(image4, 360, 180, 256, 256, null);
            }
            g2d.drawImage(image5, 80, 505, 128, 128, null);
        } else if (this.beanimage == 5) {
            if (small) {
                g2d.drawImage(image5, 365, 185, 246, 246, null);
            } else {
                g2d.drawImage(image5, 360, 180, 256, 256, null);
            }
            g2d.drawImage(image6, 80, 505, 128, 128, null);
        } else if (this.beanimage == 6) {
            if (small) {
                g2d.drawImage(image6, 365, 185, 246, 246, null);
            } else {
                g2d.drawImage(image6, 360, 180, 256, 256, null);
            }
            g2d.drawImage(image7, 80, 505, 128, 128, null);
        } else if (this.beanimage == 7) {
            if (small) {
                g2d.drawImage(image7, 365, 185, 246, 246, null);
            } else {
                g2d.drawImage(image7, 360, 180, 256, 256, null);
            }
            g2d.drawImage(image8, 80, 505, 128, 128, null);
        } else if (this.beanimage == 8) {
            if (small) {
                g2d.drawImage(image8, 365, 185, 246, 246, null);
            } else {
                g2d.drawImage(image8, 360, 180, 256, 256, null);
            }
            g2d.drawImage(image9, 80, 505, 128, 128, null);
        } else if (this.beanimage == 9) {
            if (small) {
                g2d.drawImage(image9, 365, 185, 246, 246, null);
            } else {
                g2d.drawImage(image9, 360, 180, 256, 256, null);
            }
            g2d.drawImage(image10, 80, 505, 128, 128, null);
        } else if (this.beanimage == 10) {
            if (small) {
                g2d.drawImage(image10, 365, 185, 246, 246, null);
            } else {
                g2d.drawImage(image10, 360, 180, 256, 256, null);
            }
            g2d.drawImage(image11, 30, 500, 120, 170, null);
            g2d.setColor(Color.BLACK);
            g2d.setFont(new Font("TimesRoman", Font.BOLD, 26));
            g2d.drawString("B E C O M E", 121, 525);
            g2d.setFont(new Font("TimesRoman", Font.BOLD, 26));
            g2d.drawString("T H E", 175, 555);
            g2d.setFont(new Font("TimesRoman", Font.BOLD, 26));
            g2d.drawString("B E A N", 163, 585);
            g2d.setFont(new Font("TimesRoman", Font.BOLD, 26));
            g2d.drawString("G O D", 174, 615);
            g2d.setFont(new Font("TimesRoman", Font.HANGING_BASELINE, 38));
            g2d.drawString("100M", 155, 660);
        }
    }
}
