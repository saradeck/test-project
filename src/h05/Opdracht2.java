package h05;

import java.awt.*;
import java.applet.Applet;

public class Opdracht2 extends Applet {

    int base;
    int Valerie;
    int Jeroen;
    int Hans;
    int lijnyas;

    public void init() {
        base = 200;
        Valerie = 40;
        Jeroen = 100;
        Hans = 80;
        lijnyas = 100;
    }

    public void paint(Graphics g){
        super.paint(g);
        int x = 200;
        int y = base - Valerie;
        int y2 = base - Jeroen;
        int y3 = base - Hans;
        setSize(600, 400);
        g.setColor(Color.orange);
        g.fillRect(x, y, 30, Valerie);
        g.setColor(Color.red);
        g.fillRect(x+50, y2, 30, Jeroen);
        g.setColor(Color.yellow);
        g.fillRect(x+100, y3, 30, Hans);
        g.setColor(Color.black);
        g.drawRect(x, y, 30, Valerie);
        g.drawRect(x+50, y2, 30, Jeroen);
        g.drawRect(x+100, y3, 30, Hans);
        g.drawLine(310, base, base, base);
        g.drawLine(base, 60, base, base);
        g.drawString("100",175, 110);
        g.drawString("80",175, 130);
        g.drawString("60", 175, 150);
        g.drawString("40",175, 170);
        g.drawString("20",175, 190);
        g.drawString("00",175, 210);
        g.drawString("Valerie    Jeroen    Hans",200, 220);
    }
}
