package h12;

import java.awt.*;
import java.applet.*;



public class Opdracht12_4 extends Applet{

    private boolean eindstop;
    private double[] zoektocht = { 1.0, 5.5, 10.2, 12.5, 15.6 };

    public void init() {
        double begin = 12.5;
        eindstop = false;
        int teller = 0;
        while(teller < zoektocht.length) {
            if(zoektocht[teller] == begin) eindstop = true;
            teller ++;
        }
    }

    public void paint(Graphics g) {
        if(eindstop) {
            g.drawString("De waarde is gevonden.", 20, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }

}