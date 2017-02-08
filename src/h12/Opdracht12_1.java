package h12;



        import java.awt.*;
        import java.applet.*;


public class Opdracht12_1 extends Applet{

    private double[] tafel;
    private double totaal;
    private double gemiddelde;


    public void init() {
        tafel= new double [10];

        for (int teller = 0; teller < tafel.length; teller ++) {
            tafel[teller] = 90 * teller + 40;
            totaal += tafel[teller];

        }
    }

    public void paint(Graphics g) {
        gemiddelde = totaal / tafel.length;
        g.drawString("Gemiddelde = " + gemiddelde, 40, 20);

    }
}