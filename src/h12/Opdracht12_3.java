package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Opdracht12_3 extends Applet {

    TextField[] tekstvak;
    int[] weetgeenaam;
    Button knop;


    public void init() {

        tekstvak = new TextField[5];
        weetgeenaam = new int[5];

        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("", 5);
            add(tekstvak[i]);
        }

        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new Knoplisterner());

    }

    class Knoplisterner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < tekstvak.length; i++) {
                String invoer = tekstvak[i].getText();
                weetgeenaam[i] = Integer.parseInt(invoer);
            }

            Arrays.sort(weetgeenaam);

            for (int i = 0; i < weetgeenaam.length; i++) {
                tekstvak[i].setText(String.valueOf(weetgeenaam[i]));
            }

        }
    }

}