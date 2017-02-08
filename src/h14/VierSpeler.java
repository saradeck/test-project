package h14;

/**
 * Created by simon on 30-11-2016.
 */



        import java.awt.*;
        import java.applet.Applet;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.Random;


public class VierSpeler extends Applet {

    String[] kaartsoort = { "klaver", "ruiten", "schoppen","harten"};
    String[] nummer = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};
    String[] deck1= new String[52];
    String[] deck2 = new String[53];
    String[] deck3 = new String[54];
    String[] deck4 = new String[55];
    Button knop;
    int x;
    int w;
    int s;
    int a;

    boolean geklikt;


    class Knoplisterner implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Random random = new Random();
            int r = random.nextInt(52);
            int k = random.nextInt(53);
            int l = random.nextInt(54);
            int h = random.nextInt(55);

            x = r;
            s=l ;
            w=k;
            a=h;





            geklikt = true;

            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        int y = 70;

        if (geklikt == true) {
            for (int k = 0; k < 13; k++) {
                g.drawString(" " + deck1[x], 0, y);
                g.drawString(" " + deck2[w], 100, y);
                g.drawString(" " + deck3[s], 200, y);
                g.drawString(" " + deck4[a], 300, y);
                y += 20;



            }
        }
    }
    @Override
    public void init() {

        knop = new Button("Deel kaart");
        knop.addActionListener(new Knoplisterner());
        add(knop);

        int index = 0;

        for (String kleur : kaartsoort) {
            for (int i = 0; i < nummer.length; i++) {
                String kaart = nummer[i];
                deck1[index] = kleur + " " + kaart;
                deck2[index] = kleur + " " + kaart;
                deck3[index] = kleur + " " + kaart;
                deck4[index] = kleur + " " + kaart;
                index++;


            }




            }








        }
        }








