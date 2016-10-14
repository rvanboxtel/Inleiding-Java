package HoofdstukElf;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 13-10-16.
 * Hier zie je van 20 naar tien
 */
public class OpdrachtTwee extends Applet {


    public void paint(Graphics g) {
        int teller;
        int x = 0;


        for (teller = 10; teller <= 20; teller++) {
            x += 20;
            g.drawString("" + teller, x, 100);
        }
    }
}
