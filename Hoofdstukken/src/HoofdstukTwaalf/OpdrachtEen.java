package HoofdstukTwaalf;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 31-10-16.
 */
public class OpdrachtEen extends Applet {

    int[] nummers = {1, 2, 3, 4, 5, 10, 1, 50, 25};

    public void init() {
        setSize(275, 200);
    }

    public void paint(Graphics g) {
        int x = getWidth();
        int y = getHeight();
        double gem = 0.0;

        for (int i = 0; i < nummers.length; i++) {
            g.drawString("" + nummers[i], x / 2, (y / 2 - 15 * nummers.length / 2) + 15 * i);
            gem += nummers[i];
        }
        gem /= nummers.length;
        g.drawString("Het gemiddelde is " + gem, x / 2 - 50, (y / 2 + 15 * nummers.length / 2) + 10);
    }


}
