package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Pracktijk12 extends Applet {

    int[] nummer;
    String[] voorNaam;
    Button knop;
    TextField[] textFields;
    int teller=0;
    boolean kiez;


    public void init() {
        textFields = new TextField[2];
        nummer = new int[10];
        voorNaam = new String[10];
        knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);

        for (int i = 0; i <textFields.length ; i++) {
            textFields[i] = new TextField("",15);
            textFields[i].addActionListener(kl);
            add(textFields[i]);
        }
        add(knop);

    }

    class KnopListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            if (teller <10){

                voorNaam[teller] = textFields[0].getText();
                nummer[teller] = Integer.parseInt(textFields[1].getText());

                teller++;

            } else {
                kiez = true;
                repaint();
            }
            textFields[0].setText("");
            textFields[1].setText("");
        }
    }

    @Override
    public void paint(Graphics g) {
        if (kiez == true){
            int x=50;
            int y=50;
            for (int i = 0; i <nummer.length ; i++) {
                g.drawString(voorNaam[i]+"   "+nummer[i],x,y);
                y+=25;
            }
        }
    }
}
