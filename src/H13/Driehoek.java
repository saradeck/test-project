package H13;

/**
 * Created by simon on 25-11-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Driehoek extends Applet {
    public void init() {
        setSize(1600, 1100);
    }
    public void paint(Graphics g) {
        tekenDriehoek(g, 1000, 1000, 150, 1000, 600, 150);
    }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x3, y3, x1, y1);
        g.drawLine(x2, y2, x3, y3);
    }
}
