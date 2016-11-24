
package h12;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht12_5 extends Applet{

    private int[] getallen = {55, 44, 58, 102, 23, 27, 31, 52, 17};
    TextField textField;
    Button knop;
    String Tekst;

    public void init(){
        textField = new TextField("", 8);
        add(textField);
        knop = new Button("ok");
        knop.addActionListener(new KnopListener());
        add(knop);
        Tekst = "";
    }
    public void paint(Graphics g){
        int x = 50;
        int y = 80;
        g.drawString(Tekst, x, y);
    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(textField.getText());
            boolean isGevonden = false;
            int index = 0;
            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == invoer) {
                    isGevonden = true;
                    index = i;
                }
            }
            if (isGevonden) {
                Tekst = "Is gevonden " + index;
            } else {
                Tekst = "Is niet gevonden";
            }
            repaint();
        }
    }
}
