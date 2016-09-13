package h04;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet
{

    public void paint( Graphics g )
    {
        g.setColor(Color.black);
        g.fillRect(200,100,50,150);
        g.fillRect(220,250,10,300);
        g.setColor(Color.red);
        g.fillOval(200,100,50,50);
        g.setColor(Color.yellow);
        g.fillOval(200,150,50,50);
        g.setColor(Color.green);
        g.fillOval(200,200,50,50);

    }
}
