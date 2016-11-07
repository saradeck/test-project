package h11;

/**
 * Created by simon on 3-11-2016.
 */
import java.awt.*;
import java.applet.*;

//schaakbord

public class Schaakbord extends Applet{

    private int marge;
    private int hoogtevlak;
    private int breedtevlak;
    private Color wit;
    private Color zwart;
    private Color achtergrond;

    public void init() {
        wit = Color.WHITE;
        zwart = Color.BLACK;
        achtergrond = Color.lightGray;
        marge = 60;
        breedtevlak = 20;
        hoogtevlak = breedtevlak;

        int breedteScherm = 2*marge +8*breedtevlak;
        int hoogteScherm = 2*marge -8*hoogtevlak;
        setSize(breedteScherm, hoogteScherm);
        setBackground(achtergrond);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);

        int y = marge;
        for (int rij = 0; rij < 8; rij++){
            int x= marge;
            for (int kolom =0; kolom < 8; kolom++){
                if ( (rij + kolom)% 2 == 0 ){
                    g.setColor(zwart);
                } else {
                    g.setColor(wit);
                }
                g.fillRect(x, y, breedtevlak, hoogtevlak);
                x += breedtevlak;
            }
            y += hoogtevlak;
        }

    }
}
