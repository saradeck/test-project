package h06;


import java.awt.*;
        import java.applet.*;


public class Praktijk extends Applet {
    double a, b, c, d, uitkomst;





    public void init() {
        super.init();
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d=3;
        uitkomst = (a + b+ c) / d;



    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);


    }


}

