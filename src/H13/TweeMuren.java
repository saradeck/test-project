package H13;

/**
 * Created by simon on 25-11-2016.
 */
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TweeMuren extends Applet {

    private Button baksteenknop;
    private Button betonknop;
    int breedtesteen;
    int hoogtesteen;
    private int AantalSteenHoogte;
    private int AantalSteenbreedte;
    Color kleur1;
    Color kleur2;
    boolean muurteken;

    public void init(){
        setSize(700, 400);
        baksteenknop = new Button("Bakstenen");
        baksteenknop.addActionListener(new BaksteenLuisteraar());


        betonknop = new Button("Betonblokken");
        betonknop.addActionListener(new BetonblokLuisteraar());


        muurteken = false;
        kleur2 = Color.BLACK;
        repaint();
        add(baksteenknop);
        add(betonknop);

    }

    public void paint(Graphics g){
        int x = 50;
        int y = 50;
        if (muurteken){
            for (int i = 0; i < AantalSteenbreedte; i++){
                for( int j = 0; j < AantalSteenHoogte; j++){
                    g.setColor(kleur1);
                    g.fillRect(x, y, breedtesteen, hoogtesteen);
                    g.setColor(kleur2);
                    g.drawRect(x, y, breedtesteen, hoogtesteen);
                    x += breedtesteen;
                }
                y += hoogtesteen;
                x = 50;
            }

        }
    }

    class BaksteenLuisteraar implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            breedtesteen = 40;
            hoogtesteen = 15;
            AantalSteenHoogte = 25;
            AantalSteenbreedte = 20;
            kleur1 = Color.RED;
            muurteken = true;
            repaint();
        }

    }
    class BetonblokLuisteraar implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            breedtesteen = 80;
            hoogtesteen = 30;
            AantalSteenHoogte = 15;
            AantalSteenbreedte = 10;
            kleur1 = Color.GRAY;
            muurteken = true;
            repaint();
        }

    }
}