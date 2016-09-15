package h04;

import java.awt.*;
import java.applet.*;

public class Gewicht extends Applet {
    private int[] lengteRij = {40,100,80};
    private double maximum = lengteRij[0];
    private double minimum = lengteRij[0];
    private Color kleur;
    private Staafdiagram staafdiagram; //1

    public void paint(Graphics g) {
        staafdiagram = new Staafdiagram(lengteRij,30);
        staafdiagram.drukaf(g,70,200);
        kleur = Color.red; //2
    }

    public void init() {
        for (int i = 1; i<lengteRij.length; i++) {
            if(lengteRij[i]> maximum)
                maximum = lengteRij[i];
            kleur = Color.red;
        }
        for(int i =1; i<lengteRij.length;i++) {
            if(lengteRij[i]<minimum)
                minimum = lengteRij[i];

        }
    }
    class Staafdiagram {
        private int[] lengteRij;
        private int witruimte;

        public Staafdiagram( int[] lengteRij, int witruimte) {
            this.lengteRij=lengteRij;
            this.witruimte=witruimte;
        }

        public void drukaf(Graphics g, int x, int y) {
            int xPos = x, yPos = y;

            for (int i = 0; i<lengteRij.length; i++) {
                g.setColor(Color.black);
                g.fillRect(xPos,yPos-20-lengteRij[i],10,lengteRij[i]);
                xPos += witruimte;
            }
            xPos=x;
            for(int i=0; i< lengteRij.length;i++) {
                String getalStr = ""+ lengteRij[i];
                g.drawString(getalStr, xPos, yPos);
                xPos += witruimte;
            }
        }
        public void printMaxMin() {


        }
    }
} //3
