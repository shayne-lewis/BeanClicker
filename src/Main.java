import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Color;

public class Main extends JPanel {
    private Timer timer;
    private Bean bean = new Bean();
    private BeanCounter counter = new BeanCounter();
    private Passive passive = new Passive();
    private Mute mute = new Mute();
    private boolean quit = false;
    private boolean menu = true;
    private boolean tutorial = false;
    private Music music = new Music();
    private int totaltimes = 0;
    private int totaltimem = 0;
    private int totaltimeh = 0;
    private int tutorialval = 0;
    private int GOD = 0;
    private Credits credits = new Credits();
    private String[] leader = new String[10];
    private String[] leaderscore = new String[10];
    private BufferedImage image1;
    private BufferedImage image2;

    public void resetall() {
        music.resetall();
        passive.resetall();
        counter.resetall();
        bean.resetall();
        mute.resetall();
        credits.resetall();
        quit = false;
        totaltimes = 0;
        totaltimem = 0;
        totaltimeh = 0;
        tutorial = false;
        tutorialval = 0;
    }

    public Main() {
        timer = new Timer();
        timer.schedule(new RemindTask(), 1000, 1000);

        try {
            File menubackground = new File("res\\menubackdrop.png");
            image1 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image1 = ImageIO.read(menubackground);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }

        try {
            File gamebackground = new File("res\\gamebackdrop.png");
            image2 = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
            image2 = ImageIO.read(gamebackground);
        } catch (IOException e) {
            System.out.println("No Image Found");
        }

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                credits.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        setFocusable(true);
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent bigbean) {
                if (bigbean.getX() > 360 && bigbean.getX() < 616) {
                    if (bigbean.getY() > 170 && bigbean.getY() < 426) {
                        if (!quit) {
                            if (!tutorial) {
                                bean.setSmall(true);
                                counter.counterUpdate(0);
                            }
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent bigbean) {
                bean.setSmall(false);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent bigupgrade) {
                if (bigupgrade.getX() > 30 && bigupgrade.getX() < 265) {
                    if (bigupgrade.getY() > 680 && bigupgrade.getY() < 730) {
                        if (counter.isUnlockedmain()) {
                            if (!quit) {
                                if (!tutorial) {
                                    counter.setBeancount(counter.getBeancount() - counter.getUpgradecost());
                                    counter.setBeanlevel((counter.getBeanlevel() + 1));
                                    bean.setBeanimage(bean.getBeanimage() + 1);
                                }
                            }
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent bigupgrade) {
                if (counter.isUnlockedmain()) {
                    counter.setUnlockedmain(false);
                    counter.counterUpdate(1);
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent passive1) {
                if (passive1.getX() > 339 && passive1.getX() < 403) {
                    if (passive1.getY() > 509 && passive1.getY() < 573) {
                        if (counter.getBeancount() >= passive.getPassive1cost()) {
                            if (!quit) {
                                if (!tutorial) {
                                    passive.setSmall1(true);
                                    counter.setBeancount((counter.getBeancount() - passive.getPassive1cost()));
                                    passive.setPassive1(passive.getPassive1() + 1);
                                    passive.setPassive1cost(Math.toIntExact(Math.round(passive.getPassive1cost() * 1.05)));
                                }
                            }
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent passive1) {
                passive.setSmall1(false);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent passive2) {
                if (passive2.getX() > 467 && passive2.getX() < 531) {
                    if (passive2.getY() > 509 && passive2.getY() < 573) {
                        if (counter.getBeancount() >= passive.getPassive2cost()) {
                            if (!quit) {
                                if (!tutorial) {
                                    passive.setSmall2(true);
                                    counter.setBeancount((counter.getBeancount() - passive.getPassive2cost()));
                                    passive.setPassive2(passive.getPassive2() + 1);
                                    passive.setPassive2cost(Math.toIntExact(Math.round(passive.getPassive2cost() * 1.05)));
                                }
                            }
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent passive2) {
                passive.setSmall2(false);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent passive3) {
                if (passive3.getX() > 595 && passive3.getX() < 659) {
                    if (passive3.getY() > 509 && passive3.getY() < 573) {
                        if (counter.getBeancount() >= passive.getPassive3cost()) {
                            if (!quit) {
                                if (!tutorial) {
                                    passive.setSmall3(true);
                                    counter.setBeancount((counter.getBeancount() - passive.getPassive3cost()));
                                    passive.setPassive3(passive.getPassive3() + 1);
                                    passive.setPassive3cost(Math.toIntExact(Math.round(passive.getPassive3cost() * 1.05)));
                                }
                            }
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent passive3) {
                passive.setSmall3(false);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent passive4) {
                if (passive4.getX() > 723 && passive4.getX() < 787) {
                    if (passive4.getY() > 509 && passive4.getY() < 573) {
                        if (counter.getBeancount() >= passive.getPassive4cost()) {
                            if (!quit) {
                                if (!tutorial) {
                                    passive.setSmall4(true);
                                    counter.setBeancount((counter.getBeancount() - passive.getPassive4cost()));
                                    passive.setPassive4(passive.getPassive4() + 1);
                                    passive.setPassive4cost(Math.toIntExact(Math.round(passive.getPassive4cost() * 1.05)));
                                }
                            }
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent passive4) {
                passive.setSmall4(false);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent passive5) {
                if (passive5.getX() > 339 && passive5.getX() < 403) {
                    if (passive5.getY() > 639 && passive5.getY() < 703) {
                        if (counter.getBeancount() >= passive.getPassive5cost()) {
                            if (!quit) {
                                if (!tutorial) {
                                    passive.setSmall5(true);
                                    counter.setBeancount((counter.getBeancount() - passive.getPassive5cost()));
                                    passive.setPassive5(passive.getPassive5() + 1);
                                    passive.setPassive5cost(Math.toIntExact(Math.round(passive.getPassive5cost() * 1.05)));
                                }
                            }
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent passive5) {
                passive.setSmall5(false);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent passive6) {
                if (passive6.getX() > 467 && passive6.getX() < 531) {
                    if (passive6.getY() > 639 && passive6.getY() < 703) {
                        if (counter.getBeancount() >= passive.getPassive6cost()) {
                            if (!quit) {
                                if (!tutorial) {
                                    passive.setSmall6(true);
                                    counter.setBeancount((counter.getBeancount() - passive.getPassive6cost()));
                                    passive.setPassive6(passive.getPassive6() + 1);
                                    passive.setPassive6cost(Math.toIntExact(Math.round(passive.getPassive6cost() * 1.05)));
                                }
                            }
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent passive6) {
                passive.setSmall6(false);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent passive7) {
                if (passive7.getX() > 595 && passive7.getX() < 659) {
                    if (passive7.getY() > 639 && passive7.getY() < 703) {
                        if (counter.getBeancount() >= passive.getPassive7cost()) {
                            if (!quit) {
                                if (!tutorial) {
                                    passive.setSmall7(true);
                                    counter.setBeancount((counter.getBeancount() - passive.getPassive7cost()));
                                    passive.setPassive7(passive.getPassive7() + 1);
                                    passive.setPassive7cost(Math.toIntExact(Math.round(passive.getPassive7cost() * 1.05)));
                                }
                            }
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent passive7) {
                passive.setSmall7(false);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent passive8) {
                if (passive8.getX() > 723 && passive8.getX() < 787) {
                    if (passive8.getY() > 639 && passive8.getY() < 703) {
                        if (counter.getBeancount() >= passive.getPassive8cost()) {
                            if (!quit) {
                                if (!tutorial) {
                                    passive.setSmall8(true);
                                    counter.setBeancount((counter.getBeancount() - passive.getPassive8cost()));
                                    passive.setPassive8(passive.getPassive8() + 1);
                                    passive.setPassive8cost(Math.toIntExact(Math.round(passive.getPassive8cost() * 1.05)));
                                }
                            }
                        }
                    }
                }
            }

            public void mouseReleased(MouseEvent passive8) {
                passive.setSmall8(false);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mutebutton) {
                if (mutebutton.getX() > 856 && mutebutton.getX() < 955) {
                    if (mutebutton.getY() > 499 && mutebutton.getY() < 598) {
                        if (!quit) {
                            if (!tutorial) {
                                if (!mute.isMutesound()) {
                                    mute.setMutesound(true);
                                    music.stopMusic();
                                } else {
                                    mute.setMutesound(false);
                                    music.playMusic();
                                }
                            }
                        }
                    }
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent quitbutton) {
                if (quitbutton.getX() > 855 && quitbutton.getX() < 955) {
                    if (quitbutton.getY() > 630 && quitbutton.getY() < 730) {
                        if (!quit) {
                            if (!tutorial) {
                                quit = true;
                                music.stopMusic();
                            }
                        }
                    }
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent gomenu) {
                if (gomenu.getX() > 340 && gomenu.getX() < 470) {
                    if (gomenu.getY() > 320 && gomenu.getY() < 370) {
                        if (quit) {
                            if (!tutorial) {
                                menu = true;
                            }
                        }
                    }
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent returngame) {
                if (returngame.getX() > 520 && returngame.getX() < 650) {
                    if (returngame.getY() > 320 && returngame.getY() < 370) {
                        if (quit) {
                            if (!tutorial) {
                                quit = false;
                                if (!mute.isMutesound()) {
                                    music.playMusic();
                                }
                            }
                        }
                    }
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent newgame) {
                if (newgame.getX() > 550 && newgame.getX() < 850) {
                    if (newgame.getY() > 500 && newgame.getY() < 650) {
                        if (menu) {
                            resetall();
                            menu = false;
                            music.startMusic();
                        }
                    }
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent tutorialbutton) {
                if (tutorialbutton.getX() > 550 && tutorialbutton.getX() < 850) {
                    if (tutorialbutton.getY() > 276 && tutorialbutton.getY() < 426) {
                        if (menu) {
                            resetall();
                            tutorial = true;
                            menu = false;
                        }
                    }
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent tutorialnext) {
                if (tutorial) {
                    tutorialval++;
                    if (tutorialval == 10) {
                        tutorial = false;
                        menu = true;
                    }
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent endenter) {
                if (endenter.getX() > 475 && endenter.getX() < 535) {
                    if (endenter.getY() > 455 && endenter.getY() < 485) {
                        if (credits.isDone()) {
                            counter.setCredits(false);
                            leader[GOD] = (credits.getKey1() + credits.getKey2() + credits.getKey3());
                            leaderscore[GOD] = (String.format("%02d", credits.getTimeh()) + ":" + String.format("%02d", credits.getTimem()) + ":" + String.format("%02d", credits.getTimes()));
                            GOD = GOD + 1;
                            menu = true;
                            resetall();
                        }
                    }
                }
            }
        });
    }

    public class RemindTask extends TimerTask {
        public void run() {
            if (!quit) {
                if (!tutorial) {
                    if (!counter.isCredits()) {
                        counter.setBeancount(counter.getBeancount() + passive.getTotalpassive());
                        totaltimes++;
                        if (totaltimeh == 99 && totaltimem == 59 && totaltimem == 60) {
                            counter.setCredits(true);
                        }
                        if (totaltimes == 60) {
                            totaltimem++;
                            totaltimes = 0;
                        }
                        if (totaltimem == 60) {
                            totaltimeh++;
                            totaltimem = 0;
                        }
                        credits.setTimes(totaltimes);
                        credits.setTimem(totaltimem);
                        credits.setTimeh(totaltimeh);
                        credits.setBlinking(0);
                    }
                    credits.setBlinking(credits.getBlinking() + 1);
                }
            }
        }
    }

    public static final Color BLUE2 = new Color(0, 20, 140);
    public static final Color BLUE = new Color(137, 207, 240);
    public static final Color grey = new Color(100, 100, 100, 120);
    public static final Color red2 = new Color(255, 0, 0, 200);
    public static final Color blackclear = new Color(0, 0, 0, 160);
    public static final Color whiteclear = new Color(255, 255, 255, 140);

    public void paint(Graphics g) {
        counter.counterUpdate(1);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (counter.isCredits()) {
            credits.paint(g2d);
        } else {
            if (menu) {
                resetall();
                g2d.drawImage(image1, 0, 0, 1000, 800, null);
                g2d.setColor(Color.red.darker());
                g2d.setFont(new Font("TimesRoman", Font.HANGING_BASELINE, 135));
                g2d.drawString("Bean Clicker", 100, 135);
                g2d.fillRect(100, 155, 750, 5);
                g2d.setColor(blackclear);
                g2d.fillRect(550, 276, 300, 150);
                g2d.fillRect(550, 500, 300, 150);
                g2d.fillRect(90, 236, 270, 460);
                g2d.setColor(Color.red.darker());
                g2d.drawRect(90, 236, 270, 460);
                g2d.drawRect(550, 276, 300, 150);
                g2d.drawRect(550, 500, 300, 150);
                g2d.setColor(Color.red.darker());
                g2d.setFont(new Font("TimesRoman", Font.BOLD, 34));
                g2d.drawString("Leaderboard", 120, 275);
                g2d.setFont(new Font("TimesRoman", Font.BOLD, 40));
                g2d.drawString("Tutorial", 623, 363);
                g2d.drawString("New Game", 599, 586);
                g2d.setColor(Color.WHITE);
                g2d.setFont(new Font("TimesRoman", Font.PLAIN, 28));
                if (GOD == 0) {
                    for (int i = 0; i < 10; i++) {
                        leader[i] = "XXX";
                        leaderscore[i] = "99:59:59";
                    }
                }
                for (int i = 0; i < 10; i++) {
                    //Arrays.sort(leaderscore);
                    g2d.drawString(String.format("%02d", (i + 1)) + " - " + leader[i] + " - " + leaderscore[i], 100, (280 + ((i + 1) * 40)));
                }
            } else {
                g2d.drawImage(image2, 0, 0, 1000, 500, null);
                g2d.setColor(BLUE);
                g2d.fillRect(0, 470, 1000, 1000);
                g2d.setColor(Color.BLACK);
                g2d.fillRect(0, 466, 1000, 5);
                g2d.fillRect(300, 470, 6, 1000);
                g2d.fillRect(825, 470, 6, 1000);
                g2d.setColor(Color.white);
                g2d.fillRect(20, 497, 257, 243);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(20, 497, 257, 243);
                g2d.setColor(Color.yellow);
                g2d.fillRect(30, 680, 235, 50);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(30, 680, 235, 50);
                if (counter.getBeanlevel() < 10) {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 28));
                    g2d.drawString("Upgrade Bean", 55, 714);
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 15));
                    g2d.drawString("Bean Cost: " + counter.getUpgradecost(), 34, 670);
                    g2d.drawString(counter.getNextbean() + ": " + counter.getNextamount() + " Beans Per Click", 34, 650);
                } else {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 27));
                    g2d.drawString("Activate Bean God", 36, 714);
                }
                g2d.setColor(whiteclear);
                g2d.fillRect(270, 95, 470, 60);
                g2d.setColor(Color.red.darker());
                g2d.setFont(new Font("TimesRoman", Font.BOLD, 25));
                g2d.drawString("Time Played", 718, 455);
                g2d.drawString(String.format("%02d", totaltimeh) + ":" + String.format("%02d", totaltimem) + ":" + String.format("%02d", totaltimes), 870, 455);
                if (!tutorial) {
                    g2d.setFont(new Font("TimesRoman", Font.ITALIC, 70));
                    g2d.drawString("Bean Clicker", 300, 75);
                }
                g2d.setFont(new Font("TimesRoman", Font.PLAIN, 24));
                g2d.drawString(counter.getBeanname(), 10, 395);
                g2d.drawString("Beans Per Click: " + counter.getBeanamount(), 10, 425);
                g2d.drawString("Beans Per Second: " + passive.getTotalpassive(), 10, 455);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(270, 95, 470, 60);
                g2d.drawRect(338, 508, 65, 65);
                g2d.drawRect(466, 508, 65, 65);
                g2d.drawRect(594, 508, 65, 65);
                g2d.drawRect(722, 508, 65, 65);
                g2d.drawRect(855, 498, 100, 100);
                g2d.drawRect(338, 645, 65, 65);
                g2d.drawRect(466, 645, 65, 65);
                g2d.drawRect(594, 645, 65, 65);
                g2d.drawRect(722, 645, 65, 65);
                g2d.drawRect(855, 630, 100, 100);
                g2d.setColor(Color.white);
                g2d.fillRect(339, 509, 64, 64);
                g2d.fillRect(467, 509, 64, 64);
                g2d.fillRect(595, 509, 64, 64);
                g2d.fillRect(723, 509, 64, 64);
                g2d.fillRect(339, 646, 64, 64);
                g2d.fillRect(467, 646, 64, 64);
                g2d.fillRect(595, 646, 64, 64);
                g2d.fillRect(723, 646, 64, 64);
                g2d.setColor(Color.cyan.darker());
                g2d.fillRect(856, 499, 99, 99);
                g2d.setColor(Color.red.darker());
                g2d.fillRect(856, 631, 99, 99);
                g2d.setColor(Color.black);
                g2d.setFont(new Font("TimesRoman", Font.PLAIN, 27));
                g2d.drawString("Exit", 882, 658);
                g2d.drawString("To", 888, 691);
                g2d.drawString("Menu", 871, 723);
                g2d.setFont(new Font("TimesRoman", Font.BOLD, 13));
                if (counter.getBeancount() < passive.getPassive1cost())
                    g2d.setColor(Color.red);
                else
                    g2d.setColor(Color.BLACK);
                g2d.drawString("Beanshovel", 334, 503);
                g2d.drawString("Bronze", 346, 490);
                if (counter.getBeancount() < passive.getPassive2cost())
                    g2d.setColor(Color.red);
                else
                    g2d.setColor(Color.BLACK);
                g2d.drawString("Beanshovel", 462, 503);
                g2d.drawString("Silver", 480, 490);
                if (counter.getBeancount() < passive.getPassive3cost())
                    g2d.setColor(Color.red);
                else
                    g2d.setColor(Color.BLACK);
                g2d.drawString("Beanshovel", 590, 503);
                g2d.drawString("Gold", 610, 490);
                if (counter.getBeancount() < passive.getPassive4cost())
                    g2d.setColor(Color.red);
                else
                    g2d.setColor(Color.BLACK);
                g2d.drawString("Workbean", 723, 503);
                if (counter.getBeancount() < passive.getPassive5cost())
                    g2d.setColor(Color.red);
                else
                    g2d.setColor(Color.BLACK);
                g2d.drawString("Beanployee", 334, 640);
                if (counter.getBeancount() < passive.getPassive6cost())
                    g2d.setColor(Color.red);
                else
                    g2d.setColor(Color.BLACK);
                g2d.drawString("Grandma", 468, 640);
                if (counter.getBeancount() < passive.getPassive7cost())
                    g2d.setColor(Color.red);
                else
                    g2d.setColor(Color.BLACK);
                g2d.drawString("Bean Farm", 592, 640);
                if (counter.getBeancount() < passive.getPassive8cost())
                    g2d.setColor(Color.red);
                else
                    g2d.setColor(Color.BLACK);
                g2d.drawString("Bean Factory", 713, 640);
                g2d.setColor(BLUE2);
                g2d.setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 11));
                g2d.drawString("BPS: 1", 338, 588);
                g2d.drawString("Cost: " + passive.getPassive1cost(), 338, 603);
                g2d.drawString("Owned: " + passive.getPassive1(), 338, 618);
                g2d.drawString("BPS: 3", 466, 588);
                g2d.drawString("Cost: " + passive.getPassive2cost(), 466, 603);
                g2d.drawString("Owned: " + passive.getPassive2(), 466, 618);
                g2d.drawString("BPS: 10", 594, 588);
                g2d.drawString("Cost: " + passive.getPassive3cost(), 594, 603);
                g2d.drawString("Owned: " + passive.getPassive3(), 594, 618);
                g2d.drawString("BPS: 50", 722, 588);
                g2d.drawString("Cost: " + passive.getPassive4cost(), 722, 603);
                g2d.drawString("Owned: " + passive.getPassive4(), 722, 618);
                g2d.drawString("BPS: 200", 338, 725);
                g2d.drawString("Cost: " + passive.getPassive5cost(), 338, 740);
                g2d.drawString("Owned: " + passive.getPassive5(), 338, 755);
                g2d.drawString("BPS: 700", 466, 725);
                g2d.drawString("Cost: " + passive.getPassive6cost(), 466, 740);
                g2d.drawString("Owned: " + passive.getPassive6(), 466, 755);
                g2d.drawString("BPS: 3000", 594, 725);
                g2d.drawString("Cost: " + passive.getPassive7cost(), 594, 740);
                g2d.drawString("Owned: " + passive.getPassive7(), 594, 755);
                g2d.drawString("BPS: 13500", 722, 725);
                g2d.drawString("Cost: " + passive.getPassive8cost(), 722, 740);
                g2d.drawString("Owned: " + passive.getPassive8(), 722, 755);
                passive.passiveUpdate();
                counter.paint(g2d);
                mute.paint(g2d);
                bean.paint(g2d);
                passive.paint(g2d);
                if (quit) {
                    g2d.setColor(grey);
                    g2d.fillRect(0, 0, 1000, 1000);
                    g2d.setColor(Color.BLACK);
                    g2d.fillRect(300, 200, 400, 200);
                    g2d.setColor(Color.white);
                    g2d.drawRect(300, 200, 400, 200);
                    g2d.drawRect(340, 320, 130, 50);
                    g2d.drawRect(520, 320, 130, 50);
                    g2d.setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 19));
                    g2d.drawString("Exit To", 373, 343);
                    g2d.drawString("Main Menu", 353, 362);
                    g2d.setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 24));
                    g2d.drawString("Cancel", 545, 353);
                    g2d.setFont(new Font("TimesRoman", Font.CENTER_BASELINE, 24));
                    g2d.drawString("Are You Sure You Want To Quit?", 313, 255);
                    g2d.setColor(red2);
                    g2d.drawString("All Your Progress Will Be Lost", 321, 285);
                }
            }
            if (tutorial) {
                if (tutorialval == 1) {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 26));
                    g2d.drawString("Click anywhere on the screen when you wish to advance to the next tutorial point", 30, 60);
                }
                if (tutorialval == 2) {
                    g2d.setColor(Color.MAGENTA);
                    g2d.drawRect(260, 85, 490, 80);
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 24));
                    g2d.setColor(Color.BLACK);
                    g2d.drawString("This is your bean counter, as you gain beans it will increase", 180, 60);
                }
                if (tutorialval == 3) {
                    g2d.setColor(Color.MAGENTA);
                    g2d.drawRect(340, 163, 300, 288);
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 24));
                    g2d.setColor(Color.BLACK);
                    g2d.drawString("This is the main bean, when you click it you will be", 230, 45);
                    g2d.drawString("awarded however many beans your current bean is worth per click", 140, 75);
                }
                if (tutorialval == 4) {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 24));
                    g2d.drawString("These show your current bean level,", 310, 45);
                    g2d.drawString("as well as how many beans per click it is worth", 250, 75);
                    g2d.setColor(Color.MAGENTA);
                    g2d.drawRect(5, 370, 210, 60);
                }
                if (tutorialval == 5) {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 24));
                    g2d.setColor(Color.BLACK);
                    g2d.drawString("This is the upgrade info box which", 320, 45);
                    g2d.drawString("contains the button to purchase your next bean level", 220, 75);
                    g2d.setColor(Color.MAGENTA);
                    g2d.drawRect(10, 487, 277, 263);
                }
                if (tutorialval == 6) {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 24));
                    g2d.setColor(Color.MAGENTA);
                    g2d.drawRect(320, 475, 485, 283);
                    g2d.setColor(Color.BLACK);
                    g2d.drawString("These are all the passive upgrades which can be purchased", 180, 45);
                    g2d.drawString("They will increase your BPS as well as their price when one is purchased", 110, 75);
                }
                if (tutorialval == 7) {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 24));
                    g2d.setColor(Color.BLACK);
                    g2d.drawString("This shows how many beans per second (BPS) you are currently generating", 90, 60);
                    g2d.setColor(Color.MAGENTA);
                    g2d.drawRect(5, 430, 235, 30);
                }
                if (tutorialval == 8) {
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 24));
                    g2d.setColor(Color.BLACK);
                    g2d.drawString("This timer will increase until you have beat the game", 225, 45);
                    g2d.drawString("and it will act as your score to be entered into the leaderboard", 165, 75);
                    g2d.setColor(Color.MAGENTA);
                    g2d.drawRect(710, 430, 265, 32);
                }
                if (tutorialval == 9) {
                    g2d.setColor(Color.MAGENTA);
                    g2d.drawRect(840, 485, 130, 263);
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 24));
                    g2d.setColor(Color.BLACK);
                    g2d.drawString("Finally, these two buttons will toggle the", 285, 45);
                    g2d.drawString("game music or return to the main menu respectively", 225, 75);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame f = new JFrame("Bean Clicker");
        Main c = new Main();
        f.add(c);
        f.setSize(1000, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
            c.repaint();
            Thread.sleep(10);
        }
    }
}