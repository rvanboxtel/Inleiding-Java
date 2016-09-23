package HoofdstukZes;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by romek on 14-09-16.
 */


public class Praktijk extends Applet {
    double cijferEen;
    double cijferTwee;
    double cijferDrie;
    double totaalCijfer;
    int gemiddeld;
    double gemiddeldEind;

    public void init() {
        cijferEen = 5.9;
        cijferTwee = 6.3;
        cijferDrie = 6.9;
        totaalCijfer = (cijferEen + cijferTwee + cijferDrie) / 3;
        gemiddeld = (int) (totaalCijfer * 10);
        gemiddeldEind = (double) gemiddeld / 10;
    }

    public void paint(Graphics g){
        g.drawString("Het Gemiddelde cijfer= " + gemiddeldEind, 50,50);


    }
}