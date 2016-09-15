package h06;


import java.applet.Applet;
import java.awt.*;

public class Geld extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 113;
        b = 4;
        c = 3;
        uitkomst = a/b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}
