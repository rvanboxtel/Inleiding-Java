package HoofdstukElf;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 13-10-16.
 */
public class OpdrachtVijf extends Applet {

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;

        for(teller = 1; teller <= 5; teller++) {
            y += 20;
            x += 20;
            g.drawRect(x,y,20,20);
        }
    }
}
