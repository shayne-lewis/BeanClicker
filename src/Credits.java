import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class Credits {
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
    private int yco1 = 820;
    private int yco2 = 950;
    private int yco3 = 1080;
    private int yco4 = 1210;
    private int yco5 = 1340;
    private int yco6 = 890;
    private int yco7 = 940;
    private int x1 = 0;
    private int x2 = 0;
    private int y1 = 80;
    private int b1co = -20;
    private int b2co = -380;
    private int b3co = -130;
    private int b4co = -290;
    private int b5co = -190;
    private int b6co = -420;
    private int b7co = -60;
    private int b8co = -270;
    private int b9co = -150;
    private int b10co = -410;
    private int character = 0;
    private int blinking = 0;
    private String key1 = "";
    private String key2 = "";
    private String key3 = "";
    private boolean done = false;
    private boolean namedone = false;
    private boolean nope = false;
    private int times;
    private int timem;
    private int timeh;

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public String getKey3() {
        return key3;
    }

    public void setKey3(String key3) {
        this.key3 = key3;
    }

    public int getBlinking() {
        return blinking;
    }

    public void setBlinking(int blinking) {
        this.blinking = blinking;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public void setTimem(int timem) {
        this.timem = timem;
    }

    public void setTimeh(int timeh) {
        this.timeh = timeh;
    }

    public boolean isDone() {
        return done;
    }

    public int getTimes() {
        return times;
    }

    public int getTimem() {
        return timem;
    }

    public int getTimeh() {
        return timeh;
    }

    public void resetall() {
        yco1 = 820;
        yco2 = 950;
        yco3 = 1080;
        yco4 = 1210;
        yco5 = 1340;
        yco6 = 890;
        yco7 = 940;
        x1 = 0;
        x2 = 0;
        y1 = 80;
        b1co = -20;
        b2co = -380;
        b3co = -130;
        b4co = -290;
        b5co = -190;
        b6co = -420;
        b7co = -60;
        b8co = -270;
        b9co = -150;
        b10co = -410;
        character = 0;
        blinking = 0;
        key1 = "";
        key2 = "";
        key3 = "";
        namedone = false;
        nope = false;
        done = false;
    }

    public Credits() {
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
    }

    public void keyPressed(KeyEvent e) {
        if (character < 3) {
            if (e.getKeyCode() < 65 || e.getKeyCode() > 90) {
                nope = true;
            }
            if (e.getKeyCode() >= 65 || e.getKeyCode() <= 90) {
                nope = false;
            }
            if (!nope && done) {
                if (e.getKeyCode() == 65) {
                    if (character == 0) {
                        key1 = "A";
                        character++;
                    } else if (character == 1) {
                        key2 = "A";
                        character++;
                    } else if (character == 2) {
                        key3 = "A";
                        character++;
                    }
                } else if (e.getKeyCode() == 66) {
                    if (character == 0) {
                        key1 = "B";
                        character++;
                    } else if (character == 1) {
                        key2 = "B";
                        character++;
                    } else if (character == 2) {
                        key3 = "B";
                        character++;
                    }
                } else if (e.getKeyCode() == 67) {
                    if (character == 0) {
                        key1 = "C";
                        character++;
                    } else if (character == 1) {
                        key2 = "C";
                        character++;
                    } else if (character == 2) {
                        key3 = "C";
                        character++;
                    }
                } else if (e.getKeyCode() == 68) {
                    if (character == 0) {
                        key1 = "D";
                        character++;
                    } else if (character == 1) {
                        key2 = "D";
                        character++;
                    } else if (character == 2) {
                        key3 = "D";
                        character++;
                    }
                } else if (e.getKeyCode() == 69) {
                    if (character == 0) {
                        key1 = "E";
                        character++;
                    } else if (character == 1) {
                        key2 = "E";
                        character++;
                    } else if (character == 2) {
                        key3 = "E";
                        character++;
                    }
                } else if (e.getKeyCode() == 70) {
                    if (character == 0) {
                        key1 = "F";
                        character++;
                    } else if (character == 1) {
                        key2 = "F";
                        character++;
                    } else if (character == 2) {
                        key3 = "F";
                        character++;
                    }
                } else if (e.getKeyCode() == 71) {
                    if (character == 0) {
                        key1 = "G";
                        character++;
                    } else if (character == 1) {
                        key2 = "G";
                        character++;
                    } else if (character == 2) {
                        key3 = "G";
                        character++;
                    }
                } else if (e.getKeyCode() == 72) {
                    if (character == 0) {
                        key1 = "H";
                        character++;
                    } else if (character == 1) {
                        key2 = "H";
                        character++;
                    } else if (character == 2) {
                        key3 = "H";
                        character++;
                    }
                } else if (e.getKeyCode() == 73) {
                    if (character == 0) {
                        key1 = "I";
                        character++;
                    } else if (character == 1) {
                        key2 = "I";
                        character++;
                    } else if (character == 2) {
                        key3 = "I";
                        character++;
                    }
                } else if (e.getKeyCode() == 74) {
                    if (character == 0) {
                        key1 = "J";
                        character++;
                    } else if (character == 1) {
                        key2 = "J";
                        character++;
                    } else if (character == 2) {
                        key3 = "J";
                        character++;
                    }
                } else if (e.getKeyCode() == 75) {
                    if (character == 0) {
                        key1 = "K";
                        character++;
                    } else if (character == 1) {
                        key2 = "K";
                        character++;
                    } else if (character == 2) {
                        key3 = "K";
                        character++;
                    }
                } else if (e.getKeyCode() == 76) {
                    if (character == 0) {
                        key1 = "L";
                        character++;
                    } else if (character == 1) {
                        key2 = "L";
                        character++;
                    } else if (character == 2) {
                        key3 = "L";
                        character++;
                    }
                } else if (e.getKeyCode() == 77) {
                    if (character == 0) {
                        key1 = "M";
                        character++;
                    } else if (character == 1) {
                        key2 = "M";
                        character++;
                    } else if (character == 2) {
                        key3 = "M";
                        character++;
                    }
                } else if (e.getKeyCode() == 78) {
                    if (character == 0) {
                        key1 = "N";
                        character++;
                    } else if (character == 1) {
                        key2 = "N";
                        character++;
                    } else if (character == 2) {
                        key3 = "N";
                        character++;
                    }
                } else if (e.getKeyCode() == 79) {
                    if (character == 0) {
                        key1 = "O";
                        character++;
                    } else if (character == 1) {
                        key2 = "O";
                        character++;
                    } else if (character == 2) {
                        key3 = "O";
                        character++;
                    }
                } else if (e.getKeyCode() == 80) {
                    if (character == 0) {
                        key1 = "P";
                        character++;
                    } else if (character == 1) {
                        key2 = "P";
                        character++;
                    } else if (character == 2) {
                        key3 = "P";
                        character++;
                    }
                } else if (e.getKeyCode() == 81) {
                    if (character == 0) {
                        key1 = "Q";
                        character++;
                    } else if (character == 1) {
                        key2 = "Q";
                        character++;
                    } else if (character == 2) {
                        key3 = "Q";
                        character++;
                    }
                } else if (e.getKeyCode() == 82) {
                    if (character == 0) {
                        key1 = "R";
                        character++;
                    } else if (character == 1) {
                        key2 = "R";
                        character++;
                    } else if (character == 2) {
                        key3 = "R";
                        character++;
                    }
                } else if (e.getKeyCode() == 83) {
                    if (character == 0) {
                        key1 = "S";
                        character++;
                    } else if (character == 1) {
                        key2 = "S";
                        character++;
                    } else if (character == 2) {
                        key3 = "S";
                        character++;
                    }
                } else if (e.getKeyCode() == 84) {
                    if (character == 0) {
                        key1 = "T";
                        character++;
                    } else if (character == 1) {
                        key2 = "T";
                        character++;
                    } else if (character == 2) {
                        key3 = "T";
                        character++;
                    }
                } else if (e.getKeyCode() == 85) {
                    if (character == 0) {
                        key1 = "U";
                        character++;
                    } else if (character == 1) {
                        key2 = "U";
                        character++;
                    } else if (character == 2) {
                        key3 = "U";
                        character++;
                    }
                } else if (e.getKeyCode() == 86) {
                    if (character == 0) {
                        key1 = "V";
                        character++;
                    } else if (character == 1) {
                        key2 = "V";
                        character++;
                    } else if (character == 2) {
                        key3 = "V";
                        character++;
                    }
                } else if (e.getKeyCode() == 87) {
                    if (character == 0) {
                        key1 = "W";
                        character++;
                    } else if (character == 1) {
                        key2 = "W";
                        character++;
                    } else if (character == 2) {
                        key3 = "W";
                        character++;
                    }
                } else if (e.getKeyCode() == 88) {
                    if (character == 0) {
                        key1 = "X";
                        character++;
                    } else if (character == 1) {
                        key2 = "X";
                        character++;
                    } else if (character == 2) {
                        key3 = "X";
                        character++;
                    }
                } else if (e.getKeyCode() == 89) {
                    if (character == 0) {
                        key1 = "Y";
                        character++;
                    } else if (character == 1) {
                        key2 = "Y";
                        character++;
                    } else if (character == 2) {
                        key3 = "Y";
                        character++;
                    }
                } else if (e.getKeyCode() == 90) {
                    if (character == 0) {
                        key1 = "Z";
                        character++;
                    } else if (character == 1) {
                        key2 = "Z";
                        character++;
                    } else if (character == 2) {
                        key3 = "Z";
                        character++;
                    }
                }
            }
        }
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, 1000, 1000);
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("TimesRoman", Font.HANGING_BASELINE, 40));
        g2d.drawString("Thanks For Playing", 330, yco1);
        g2d.setFont(new Font("TimesRoman", Font.HANGING_BASELINE, 20));
        g2d.drawString("Design And Implimentation", 380, yco2 - 30);
        g2d.drawString("Riley Eaton", 450, yco2);
        g2d.drawString("Graphical Designer", 410, yco3 - 30);
        g2d.drawString("Jackson McConnachie", 392, yco3);
        g2d.drawString("Project Manager", 420, yco4 - 30);
        g2d.drawString("Shayne Lewis", 430, yco4);
        g2d.drawString("Project Manager", 420, yco4 - 30);
        g2d.drawString("Shayne Lewis", 430, yco4);
        g2d.drawString("Your Total Time", 420 + x1, yco5 - 30);
        g2d.drawString(String.format("%02d", timeh) + ":" + String.format("%02d", timem) + ":" + String.format("%02d", times), 450 + x2, yco5);
        g2d.setFont(new Font("TimesRoman", Font.BOLD, 24));
        g2d.drawString("Please Enter Your Name", 375, yco6);
        g2d.setFont(new Font("TimesRoman", Font.BOLD, 28));
        if (nope) {
            g2d.setColor(Color.red);
            g2d.drawString("[        ]", 465, yco7);
        } else {
            g2d.setColor(Color.WHITE);
            g2d.drawString("[        ]", 465, yco7);
        }
        g2d.setFont(new Font("TimesRoman", Font.HANGING_BASELINE, 20));
        if (!namedone) {
            g2d.setColor(Color.red);
        } else {
            g2d.setColor(Color.green);
        }
        g2d.drawString("Enter", 481, 1123 + y1);
        g2d.drawRect(475, 1100 + y1, 60, 30);
        g2d.drawImage(image1, 50, b1co, 64, 64, null);
        g2d.drawImage(image2, 134, b2co, 64, 64, null);
        g2d.drawImage(image3, 218, b3co, 64, 64, null);
        g2d.drawImage(image4, 302, b4co, 64, 64, null);
        g2d.drawImage(image5, 388, b5co, 64, 64, null);
        g2d.drawImage(image6, 475, b6co, 64, 64, null);
        g2d.drawImage(image7, 564, b7co, 64, 64, null);
        g2d.drawImage(image8, 658, b8co, 64, 64, null);
        g2d.drawImage(image9, 752, b9co, 64, 64, null);
        g2d.drawImage(image10, 846, b10co, 64, 64, null);
        if (key1 != "") {
            g2d.setFont(new Font("TimesRoman", Font.BOLD, 25));
            g2d.setColor(Color.WHITE);
            g2d.drawString(key1, 477, 412);
        }
        if (key2 != "") {
            g2d.setFont(new Font("TimesRoman", Font.BOLD, 25));
            g2d.setColor(Color.WHITE);
            g2d.drawString(key2, 498, 412);
        }
        if (key3 != "") {
            g2d.setFont(new Font("TimesRoman", Font.BOLD, 25));
            g2d.setColor(Color.WHITE);
            g2d.drawString(key3, 517, 412);
        }
        if (!done) {
            try {
                Thread.sleep(10);
                yco1--;
                yco2--;
                yco3--;
                yco4--;
                if (yco5 > 400) {
                    yco5--;
                }
                if (yco5 == 400 && y1 + 1100 > 455) {
                    y1--;
                }
                if (yco6 < 730) {
                    x1++;
                    x2--;
                }
                if (yco5 == 400 && yco6 > 360) {
                    yco6--;
                    yco7--;
                }
                if (y1 == -645) {
                    done = true;
                }
                b1co++;
                b2co++;
                b3co++;
                b4co++;
                b5co++;
                b6co++;
                b7co++;
                b8co++;
                b9co++;
                b10co++;
            } catch (InterruptedException x) {
                Thread.currentThread().interrupt();
            }
        } else {
            if (character == 0) {
                if (blinking % 2 == 0) {
                    g2d.setColor(Color.BLACK);
                    g2d.fillRect(478, 415, 15, 2);
                } else {
                    g2d.setColor(Color.WHITE);
                    if (nope) {
                        g2d.setColor(Color.red);
                    }
                    g2d.fillRect(478, 415, 15, 2);
                }
            }
            if (character == 1) {
                if (blinking % 2 == 0) {
                    g2d.setColor(Color.BLACK);
                    g2d.fillRect(498, 415, 15, 2);
                } else {
                    g2d.setColor(Color.WHITE);
                    if (nope) {
                        g2d.setColor(Color.red);
                    }
                    g2d.fillRect(498, 415, 15, 2);
                }
            }
            if (character == 2) {
                if (blinking % 2 == 0) {
                    g2d.setColor(Color.BLACK);
                    g2d.fillRect(518, 415, 15, 2);
                } else {
                    g2d.setColor(Color.WHITE);
                    if (nope) {
                        g2d.setColor(Color.red);
                    }
                    g2d.fillRect(518, 415, 15, 2);
                }
            }
            if (character == 3) {
                namedone = true;
            }
        }
    }
}
