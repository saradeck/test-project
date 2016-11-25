package H13;

/**
 * Created by simon on 25-11-2016.
 */
import java.awt.*;
import java.applet.*;



public class Bomen extends Applet {
    int x = 100;


    public void init() {
        setSize(1200,200);
    }

    public void tekenboom( Graphics g, int x1, int y1, int x2, int y2) {
        g.setColor(Color.black);
        g.fillRect(x1, y1, 20, 60);
        g.setColor(Color.GREEN);
        g.fillOval(x2, y2, 60, 60);
    }
    public void paint(Graphics g) {
        for (int teller = 0; teller < 10; teller++) {
            x += 100;



            tekenboom(g,x,120,x - 20,60);
        }
    }



        }

