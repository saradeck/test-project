package h06;


import java.awt.*;
import java.applet.*;


public class Tijd extends Applet {

 int a;
    int b;
    int c;
    int d;
    int uitkomst;





    public void init() {
        super.init();
        a = 60;
        b = 60;
        c = 24;
        d= 365;
        uitkomst = a* b* c* d;



    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);


    }


}
