package h12;

import java.awt.*;
import java.applet.*;

/**
 * Created by Gebruiker on 29-10-2016.
 * Af
 */
public class Opdracht12_4 extends Applet{

    boolean gevonden;
    double[] salaris = { 1.0, 5.5, 10.2, 12.5, 15.6 };
    double gezocht;

    public void init() {
        gezocht = 12.5;
        gevonden = false;
        int teller = 0;
        while(teller < salaris.length) {
            if(salaris[teller] == gezocht) {
                gevonden = true;
            }
            teller ++;
        }
    }

    public void paint(Graphics g) {
        if(gevonden == true) {
            g.drawString("De waarde is gevonden.", 20, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }

}