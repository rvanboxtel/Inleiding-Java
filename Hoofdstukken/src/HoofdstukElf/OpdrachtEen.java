package HoofdstukElf;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 13-10-16.
 */


public class OpdrachtEen extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 1; teller <= 10; teller++) {
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + teller, 305, y );
        }
    }
}