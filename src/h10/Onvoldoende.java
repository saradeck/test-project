package h10;



import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Onvoldoende extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het dagnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "slecht";
                    break;
                case 2:
                    tekst = "slecht";
                    break;
                case 3:
                    tekst = "slecht";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                    tekst = "voldoende";
                    break;
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                    tekst = "goed";
                    break;
                case 9:
                    tekst = "goed";
                    break;
                case 10:
                    tekst = "goed";
                    break;
                default:
                    tekst = "waarschuwing u heeft een verkeerd cijfer ingevoerd";
                    break;
            }
            repaint();
        }
    }
}