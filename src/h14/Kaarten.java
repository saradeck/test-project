package h14;

/**
 * Created by simon on 30-11-2016.
 */
import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Kaarten extends Applet {

    String[] kaartsoort = { "klaver", "ruiten", "schoppen","harten"};
    String[] nummer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};
    String[] deck = new String[52];
    Button knop;
    int x;
    boolean geklikt;


    class Knoplisterner implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Random random = new Random();
            int r = random.nextInt(52);
            x = r;

            geklikt = true;

            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        if (geklikt == true) {
            g.drawString(" " + deck[x], 50, 50);
        }
    }

    @Override
    public void init() {

        knop = new Button("Deel kaart");
        knop.addActionListener(new Knoplisterner());
        add(knop);

        int index = 0;

        for (int i = 0; i < kaartsoort.length; i++) {
            String kleur = kaartsoort[i];
            for (int j = 0; j < nummer.length; j++) {
                String kaart = nummer[j];
                deck[index] = kleur + " " + kaart;
                index++;
            }
        }
    }
}