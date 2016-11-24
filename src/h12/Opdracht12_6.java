package h12;



import java.awt.*;
        import java.applet.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;


public class Opdracht12_6 extends Applet{

    boolean geklikt, gevonden;
    int[] waardenummers = { 1, 1, 4, 4, 4, 4, 6, 6, 6, 8, 8, 8, 10, 10, 10 };
    int getal;
    int nummer;
    TextField tekstvak;
    Button knop;

    public void init() {

        tekstvak = new TextField("",5);
        add(tekstvak);

        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new Knoplisterner());
    }

    class Knoplisterner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String invoer = tekstvak.getText();
            getal = Integer.parseInt(invoer);
            gevonden = false;
            geklikt = true;
            nummer = 0;
            for (int i = 0; i < waardenummers.length; i++) {
                if (waardenummers[i] == getal) {
                    gevonden = true;
                    nummer++;
                }
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        if (geklikt) {
            if (gevonden == true) {
                g.drawString("De waarde komt " + nummer + " keer voor.", 20, 50);
            } else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
        }
    }

}