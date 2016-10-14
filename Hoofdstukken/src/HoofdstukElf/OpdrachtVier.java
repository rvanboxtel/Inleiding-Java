package HoofdstukElf;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romek on 13-10-16.
 * Dit is de Tafel van drie.
 */
public class OpdrachtVier extends Applet {

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        for (int drie = 3; drie < 33; drie += 3) {
            g.drawString("" + drie, x, y);
            x += 20;
        }
    }

}
