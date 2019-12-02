import java.awt.*;
import java.awt.Color;

public class BeanCounter {
    private int beancount = 0;
    private int beanlevel = 1;
    private int upgradecost;
    private String beanname;
    private String nextbean;
    private boolean unlockedmain = false;
    private int beanamount;
    private int nextamount;
    private double newcount = 0;
    private boolean credits = false;

    public boolean isCredits() {
        return credits;
    }

    public void setCredits(boolean credits) {
        this.credits = credits;
    }

    public int getUpgradecost() {
        return upgradecost;
    }

    public boolean isUnlockedmain() {
        return unlockedmain;
    }

    public void setUnlockedmain(boolean i) {
        this.unlockedmain = unlockedmain;
    }

    public int getBeancount() {
        return beancount;

    }

    public String getNextbean() {
        return nextbean;
    }

    public int getBeanamount() {
        return beanamount;
    }

    public int getNextamount() {
        return nextamount;
    }

    public String getBeanname() {
        return beanname;
    }

    public void setBeancount(int beancount) {
        this.beancount = beancount;
        this.newcount = beancount;
    }

    public void setBeanlevel(int beanlevel) {
        this.beanlevel = beanlevel;
    }

    public int getBeanlevel() {
        return beanlevel;
    }

    public void resetall() {
        beancount = 1000000000;
        beanlevel = 1;
        unlockedmain = false;
        newcount = 0;
        credits = false;
    }

    public void counterUpdate(int from) {
        int dontcount = from;
        if (dontcount == 1) {
            if (beanlevel == 1) {
                upgradecost = 150;
                beanname = "Green Bean";
                nextbean = "Lima Bean";
                beanamount = 1;
                nextamount = 5;
            } else if (beanlevel == 2) {
                upgradecost = 500;
                beanname = "Lima Bean";
                nextbean = "Kidney Bean";
                beanamount = 5;
                nextamount = 10;
            } else if (beanlevel == 3) {
                upgradecost = 2000;
                beanname = "Kidney Bean";
                nextbean = "Fava Bean";
                beanamount = 10;
                nextamount = 25;
            } else if (beanlevel == 4) {
                upgradecost = 5000;
                beanname = "Fava Bean";
                nextbean = "Pinto Bean";
                beanamount = 25;
                nextamount = 100;
            } else if (beanlevel == 5) {
                upgradecost = 25000;
                beanname = "Pinto Bean";
                nextbean = "Soybean";
                beanamount = 100;
                nextamount = 250;
            } else if (beanlevel == 6) {
                upgradecost = 80000;
                beanname = "Soybean";
                nextbean = "Black Bean";
                beanamount = 250;
                nextamount = 1000;
            } else if (beanlevel == 7) {
                upgradecost = 200000;
                beanname = "Black Bean";
                nextbean = "Coffee Bean";
                beanamount = 1000;
                nextamount = 2500;
            } else if (beanlevel == 8) {
                upgradecost = 450000;
                beanname = "Coffee Bean";
                nextbean = "Jelly Bean";
                beanamount = 2500;
                nextamount = 5000;
            } else if (beanlevel == 9) {
                upgradecost = 3500000;
                beanname = "Jelly Bean";
                nextbean = "Mr. Bean";
                beanamount = 5000;
                nextamount = 15000;
            } else if (beanlevel == 10) {
                upgradecost = 100000000;
                beanname = "Mr. Bean";
                beanamount = 15000;
            } else if (beanlevel == 11) {
                this.credits = true;
            }
        } else if (beanlevel == 1) {
            beancount = beancount + 1;
            upgradecost = 150;
        } else if (beanlevel == 2) {
            beancount = beancount + 5;
            upgradecost = 500;
        } else if (beanlevel == 3) {
            beancount = beancount + 10;
            upgradecost = 2000;
        } else if (beanlevel == 4) {
            beancount = beancount + 25;
            upgradecost = 5000;
        } else if (beanlevel == 5) {
            beancount = beancount + 100;
            upgradecost = 15000;
        } else if (beanlevel == 6) {
            beancount = beancount + 250;
            upgradecost = 50000;
        } else if (beanlevel == 7) {
            beancount = beancount + 1000;
            upgradecost = 100000;
        } else if (beanlevel == 8) {
            beancount = beancount + 2500;
            upgradecost = 250000;
        } else if (beanlevel == 9) {
            beancount = beancount + 5000;
            upgradecost = 2500000;
        } else if (beanlevel == 10) {
            beancount = beancount + 15000;
            upgradecost = 100000000;
        }
        if (beancount < upgradecost) {
            unlockedmain = false;
        } else {
            unlockedmain = true;
        }
        newcount = beancount;
    }

    public static final Color BROWN = new Color(77, 31, 10);

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(BROWN);
        g2d.setFont(new Font("TimesRoman", Font.PLAIN, 50));
        if (newcount < 1000000) {
            g2d.drawString("Beans: " + beancount, 279, 143);
        } else {
            g2d.drawString("Beans: " + String.format("%.1f", (newcount / 1000000)) + "M", 279, 143);
        }
        if (!unlockedmain) {
            g2d.setColor(Color.red);
            g2d.drawLine(30, 680, 265, 730);
            g2d.drawLine(265, 680, 30, 730);
        }
    }
}
