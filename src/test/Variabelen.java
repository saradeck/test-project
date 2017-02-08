package test;


import java.awt.*;
import java.applet.*;
import java.awt.Font;

public class Variabelen extends Applet {

    Color achtergrond;
    Color tekst;
    int getal1;
    int getal2;
    Font mijnfont;


    public void init() {
        super.init();
        achtergrond = new Color(0, 0, 102);
        tekst = new Color(204, 255, 255);
        getal1 = 113;
        getal2 = 4;
        setBackground(achtergrond);
        mijnfont= new Font("TimesRoman", Font.BOLD, 50);

    }

        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(tekst);
            g.setFont(mijnfont);
        int x= 50;
        int y=50;
        g.drawString("som is:"  + (getal1/getal2), x, y);
         y= y + 50;
            g.drawString("som is:"  + (getal1 *getal2),x, y);
    }


    }

