package h08;

import java.awt.*;
import java.awt.event.*;

public class Openavond extends Frame  implements WindowListener, ActionListener {
    TextField mannen;
    TextField vrouwen;
    TextField tsmannen;
    TextField tsvrouwen;
    Button a;
    Button b;
    Button c;
    Button d;
    private int numClicks = 0;

    public static void main(String[] args) {
        Openavond myWindow = new Openavond("Open avond ");
        myWindow.setSize(350, 100);
        myWindow.setVisible(true);
    }



    public Openavond(String title) {

        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);
        a = new Button("mannen");
        b = new Button("vrouwen");
        c = new Button("toekomstige mannelijke studenten");
        d = new Button("toekomstige vrouwelijke studenten");
        add(a);
        add(b);
        add(c);
        add(d);
        add(mannen);
        add(vrouwen);
        add(tsmannen);
        add(tsvrouwen);
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        mannen = new TextField(30);
        vrouwen = new TextField(40);
        tsmannen = new TextField(50);
        tsvrouwen = new TextField(60);
    }

    public void actionPerformed(ActionEvent e) {
        numClicks++;
        mannen.setText("mannen " + numClicks + " ");
        vrouwen.setText("vrouwen " + numClicks + " ");
        tsmannen.setText("toekomstige mannelijke leerlingen " + numClicks + " ");
        tsvrouwen.setText("toekomstige vrouweljke leerlingen" + numClicks + " ");
    }

    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

}