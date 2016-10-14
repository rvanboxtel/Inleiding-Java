package HoofdstukElf;

import java.applet.*;
import java.awt.*;

/**
 * Created by Romek on 13-10-16.
 */
public class OpdrachtDrie extends Applet {

    public void paint(Graphics g) {
        int x = 50;
        int y = 30;
        int z = 1;
        for (int i = 1; i < 30; i += z) {
            g.drawString("" + i, x, y);
            x += 20;
            z++;
        }


    }
}

