package h04;

import java.applet.*;

import java.awt.*;


/*<applet code='flag.java' height=500 width=800></applet>*/

public class Flag extends Applet {

    public void init()
    {
    }
    public void paint(Graphics g) {





        Color c1 = new Color(230, 39, 30);



        g.setColor(Color.black);

        g.fillRect(500, 100, 5, 400);

        g.setColor(c1);

        g.fillRect(505, 102, 180, 40);

        g.setColor(Color.white);

        g.fillRect(505, 142, 180, 40);

        g.setColor(Color.blue);

        g.fillRect(505, 182, 180, 40);




    }
}