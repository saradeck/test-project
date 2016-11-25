package H13;

/**
 * Created by simon on 25-11-2016.
 */
import javafx.scene.control.*;

import java.awt.*;
import java.applet.Applet;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;


public class Vijfkleuren extends Applet {

    TextField tekstvak;
    Button green;
    Button blue;
    Button yellow;
    Button red;
    Button black;


    public void init() {

        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new TekstvakListener());

        green = new Button("groen");
        KnopListener kl = new KnopListener();
        green.addActionListener(kl);

        blue = new Button("blauw");
        KnopListener1 rs = new KnopListener1();
        blue.addActionListener(rs);

        yellow = new Button("geel");
        KnopListener2 ss = new KnopListener2();
        yellow.addActionListener(ss);

        red = new Button("rood");
        KnopListener3 bs = new KnopListener3();
        red.addActionListener(bs);

        black = new Button("zwart");
        KnopListener4 cs = new KnopListener4();
        black.addActionListener(cs);

        add(blue);
        add(green);
        add(yellow);
        add(red);
        add(black);
        add(tekstvak);


    }

    public void paint(Graphics g) {
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.green);
        }
    }


    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.blue);
        }
    }


    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.yellow);
        }
    }


    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.red);
        }
    }


    class KnopListener4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setBackground(Color.black);


        }
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}













