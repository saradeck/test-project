package h11;

import java.awt.*;
import java.applet.*;

public class Cirkel50 extends Applet{

    public void init(){}
    int teller;
    int x;
    int y;
    int z;

    public void paint(Graphics g){
        super.paint(g);

        while(teller <50){
            x+=-3;
            y+=6;
            g.drawOval(160+x, 160+x, 5+y, 5+y);
            teller++;
        }
    }
}
