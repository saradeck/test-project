package h08;

import java.applet.*;
import java.awt.*;
import  java.awt.event.*;
import java.lang.*;

public class Staafdiagramknopredone extends Applet {

    int V ;

    int J;

    int H;

    Button B1;
    TextField Vt;
    TextField Jt;
    TextField Ht;
    Label Vl;
    Label Jl;
    Label Hl;
    String Vs;
    String Js;
    String Hs;

    int V1;
    int V2;
    int H1;
    int H2;
    int J1;
    int J2;
    int X;




    public void init() {
        J = 100;
        H = 80;
        V = 40;


        Vl = new Label("Valerie");
        Vt = new TextField(""+V, 3);

        Jl = new Label("Jeroen");
        Jt = new TextField(""+J, 3);

        Hl = new Label("Hans");
        Ht = new TextField(""+H, 3);

        B1 = new Button("Update");
        B1.addActionListener(new Update1());


        add(Jl);
        add(Jt);

        add(Hl);
        add(Ht);

        add(Vl);
        add(Vt);


        add(B1);


        X=15;
        V1 = 200 - (X*V)/10;
        V2=X*V/10;
        H1 = 200 - (H*X)/10;
        H2=H*X/10;
        J1 = 200 - (J*X)/10;
        J2=X*J/10;
    }


    public class Update1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Vs= Vt.getText();
            V= Integer.parseInt(Vs);
            Js= Jt.getText();
            J= Integer.parseInt(Js);
            Hs= Ht.getText();
            H= Integer.parseInt(Hs);


            X=15;
            V1 = 200 - (X*V)/10;
            V2=X*V/10;
            H1 = 200 - (H*X)/10;
            H2=H*X/10;
            J1 = 200 - (J*X)/10;
            J2=X*J/10;



            repaint();
        }
    }




    public void paint(Graphics g){
        g.setColor(Color.lightGray);
        g.drawLine(6,80,200,80);
        g.drawLine(6,110,200,110);
        g.drawLine(6,140,200,140);
        g.drawLine(6,170,200,170);
        g.drawLine(6,200,200,200);
        g.drawLine(4,50,200,50);


        g.setColor(Color.black);
        g.drawLine(20, 20, 20, 200);
        g.drawLine(20, 200, 200, 200);

        g.setColor(Color.black);
        g.drawString("0", 10, 200);
        g.drawString("20", 5, 170);
        g.drawString("40", 5, 140);
        g.drawString("60", 5, 110);
        g.drawString("80", 5, 80);
        g.drawString("100", 0, 50);

        g.drawString("Jeroen", 30, 220);
        g.drawString("Hans", 90, 220);
        g.drawString("Valerie", 150, 220);
//Jeroen
        g.setColor(Color.orange);
        g.fillRect(30, J1, 50, J2);
//hans
        g.setColor(Color.yellow);
        g.fillRect(90, H1, 50, H2);
//Valerie
        g.setColor(Color.red);
        g.fillRect(150, V1, 50, V2);

    }
}




