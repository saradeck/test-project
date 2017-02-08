package test;



import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Awsome extends Applet {


    int breedtesteen;
    int hoogtesteen;
    private int AantalSteenHor;
    private int AantalSteenver;
    Color kleur1;
    Color Kleur2;


    public void init() {
        setSize(2000, 2000);
        Kleur2 = Color.black;
        repaint();
    }

    public void paint(Graphics g) {
        int x = 25;
        int y = 25;
        breedtesteen = 40;
        hoogtesteen = 30;
        AantalSteenHor = 40;
        AantalSteenver = 40;
        kleur1 = Color.green;
        setBackground(Color.black);

        repaint();

        for (int i = 0; i < AantalSteenver; i++) {
            for (int j = 0; j < AantalSteenHor; j++) {
                g.setColor(kleur1);
                g.fillRect(x, y, breedtesteen, hoogtesteen);
                g.setColor(Kleur2);
                g.drawRect(x, y, breedtesteen, hoogtesteen);
                x += breedtesteen;
            }
            y += hoogtesteen;
            x = 25;
        }

    }

}


