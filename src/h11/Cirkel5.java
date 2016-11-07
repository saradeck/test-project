package h11;

import java.awt.*;
import java.applet.*;

public class Cirkel5 extends Applet{

    public void init(){}
    int teller;
    int x;
    int y;
    int z;

    public void paint(Graphics g){
        super.paint(g);

        while(teller <5){
            x+=-4;
            y+=8;
            g.drawOval(100+x, 100+x, 10+y, 10+y);
            teller++;
        }
    }
}
